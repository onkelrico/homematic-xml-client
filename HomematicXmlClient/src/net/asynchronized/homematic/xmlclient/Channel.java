/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author enrico
 */
@Root
public class Channel {
    @Attribute(required = false)
    private String name;
    @Attribute(required = false)
    private Integer type;
    @Attribute(required = false)
    private String address;
    @Attribute(name = "ise_id")
    private Integer iseId;
    @Attribute(required = false)
    private String direction;
    @Attribute(name = "parent_device", required = false)
    private Integer parentDevice;
    @Attribute(required = false)
    private Integer index;
    @Attribute(name = "group_partner", required = false)
    private String groupPartner;
    @Attribute(name = "aes_available", required = false)
    private Boolean aesAvailable;
    @Attribute(name = "transmission_mode", required = false)
    private String transmissionMode;
    @Attribute(required = false)
    private Boolean visible;
    @Attribute(name = "ready_config", required = false)
    private Boolean readyConfig;
    @Attribute(required = false)
    private Boolean operate;
    @ElementList(inline = true, required = false)
    private List<DataPoint> dataPoints;

    public Channel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIseId() {
        return iseId;
    }

    public void setIseId(Integer iseId) {
        this.iseId = iseId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getParentDevice() {
        return parentDevice;
    }

    public void setParentDevice(Integer parentDevice) {
        this.parentDevice = parentDevice;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getGroupPartner() {
        if (groupPartner == "") {
            return null;
        }
        return Integer.parseInt(groupPartner);
    }

    public void setGroupPartner(Integer groupPartner) {
        this.groupPartner = groupPartner + "";
    }

    public Boolean getAesAvailable() {
        return aesAvailable;
    }

    public void setAesAvailable(Boolean aesAvailable) {
        this.aesAvailable = aesAvailable;
    }

    public String getTransmissionMode() {
        return transmissionMode;
    }

    public void setTransmissionMode(String transmissionMode) {
        this.transmissionMode = transmissionMode;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getReadyConfig() {
        return readyConfig;
    }

    public void setReadyConfig(Boolean readyConfig) {
        this.readyConfig = readyConfig;
    }

    public Boolean getOperate() {
        return operate;
    }

    public void setOperate(Boolean operate) {
        this.operate = operate;
    }

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public String toString() {
        return "Channel{" + "name=" + name + ", type=" + type + ", address=" + address + ", iseId=" + iseId + ", direction=" + direction + ", parentDevice=" + parentDevice + ", index=" + index + ", groupPartner=" + groupPartner + ", aesAvailable=" + aesAvailable + ", transmissionMode=" + transmissionMode + ", visible=" + visible + ", readyConfig=" + readyConfig + ", operate=" + operate + ", dataPoints=" + dataPoints + '}';
    }
    
}
