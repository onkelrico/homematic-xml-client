/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

/**
 *
 * @author enrico
 */
public class HomematicXmlClient {

    public static final String PARAM_DEVICE_ID = "device_id";
    public static final String PARAM_CHANNEL_ID = "channel_id";
    public static final String PARAM_DATAPOINT_ID = "datapoint_id";

    private String apiUrl = "http://homematic-ccu2/config/xmlapi/";
    private Serializer serializer = new Persister();

    public HomematicXmlClient(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public HomematicXmlClient() {

    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    private <T> T call(Class<? extends T> type, String scriptName) throws MalformedURLException, IOException, Exception {
        T t = null;

        URL url = new URL(apiUrl + scriptName);
        System.out.println("URL: " + url);
        URLConnection connection = url.openConnection();
        t = serializer.read(type, connection.getInputStream());
        return t;
    }

    public String getVersion() throws Exception {
        String version = call(String.class, "version.cgi");

        return version;
    }

    public List<Device> getDeviceList(boolean showInternal) throws Exception {
        String script = "devicelist.cgi";
        if (showInternal) {
            script += "?show_internal=1";
        }
        DeviceList list = call(DeviceList.class, script);
        return list.getDevices();
    }

    public List<Function> getFunctionList() throws Exception {
        FunctionList list = call(FunctionList.class, "functionlist.cgi");
        return list.getFunctionList();
    }

    public List<Favorite> getFavoriteList() throws Exception {
        FavoriteList list = call(FavoriteList.class, "favoritelist.cgi");
        return list.getFavorites();
    }

    public List<Room> getRoomList() throws Exception {
        RoomList list = call(RoomList.class, "roomlist.cgi");
        return list.getRoomList();
    }

    // TODO: ScriptErrors function
    public List<SystemVariable> getSystemVariableList(boolean text) throws Exception {
        String script = "sysvarlist.cgi";
        if (text) {
            script += "?text=true";
        }
        SystemVariableList list = call(SystemVariableList.class, script);
        return list.getVariables();
    }

    public List<SystemVariable> getSystemVariable(Integer iseId) throws Exception {
        SystemVariableList list = call(SystemVariableList.class, "sysvar.cgi?ise_id=" + iseId);
        return list.getVariables();
    }

    public State getState(String scope, List<Integer> ids) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (Integer id : ids) {
            sb.append(id).append(",");
        }
        String params = sb.toString().substring(0, sb.toString().length() - 1);
        State state = call(State.class, "state.cgi?" + scope + "=" + params);
        return state;
    }

    public List<Device> getStateList() throws Exception {
        StateList list = call(StateList.class, "statelist.cgi");
        return list.getDevices();
    }

    public List<Notification> getSystemNotifications() throws Exception {
        SystemNotification notification = call(SystemNotification.class, "systemNotification.cgi");
        return notification.getNotifications();
    }

    public void clearSystemNotifications() throws Exception {
        call(String.class, "systemNotificationClear.cgi");
    }

    public List<Program> getProgramList() throws Exception {
        ProgramList list = call(ProgramList.class, "programlist.cgi");
        return list.getProgramList();
    }

    public List<Record> getSystemProtocol() throws Exception {
        SystemProtocol list = call(SystemProtocol.class, "protocol.cgi");
        return list.getRecordList();
    }

    public List<Rssi> getRssiList() throws Exception {
        RssiList list = call(RssiList.class, "rssilist.cgi");
        return list.getRssiList();
    }

    public Result changeState(List<ChangeAction> actions) throws Exception {
        String idParam = "ise_id=";
        String valueParam = "new_value=";
        for (ChangeAction action : actions) {
            idParam += action.getIseId() + ",";
            valueParam += action.getNewValue() + ",";
        }
        idParam = idParam.substring(0, idParam.length() - 1);
        valueParam = valueParam.substring(0, valueParam.length() - 1);
        Result result = call(Result.class, "statechange.cgi?" + idParam + "&" + valueParam);
        return result;
    }

    public Result runProgram(Integer programId) throws Exception {
        Result result = call(Result.class, "runprogram.cgi?program_id=" + programId);
        return result;
    }
}
