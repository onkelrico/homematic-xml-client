/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 *
 * @author enrico
 */
@Root
public class State {
    @ElementList(inline = true, required = false)
    private List<Device> devices;
    @ElementList(inline = true, required = false)
    private List<DataPoint> dataPoints;

    public State() {
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<DataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    @Override
    public String toString() {
        return "State{" + "devices=" + devices + ", dataPoints=" + dataPoints + '}';
    }
    
}
