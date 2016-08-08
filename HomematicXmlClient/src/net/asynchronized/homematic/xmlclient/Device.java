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
public class Device {
    @Attribute
    private String name;
    @Attribute(required = false)
    private String address;
    @Attribute(name = "ise_id")
    private Integer iseId;
    @Attribute(name = "interface", required = false)
    private String iface;
    @Attribute(name = "device_type", required = false)
    private String deviceType;
    @Attribute(name = "ready_config", required = false)
    private Boolean readyConfig;
    @Attribute(required = false)
    private Boolean unreach;
    @Attribute(name = "sticky_unreach", required = false)
    private Boolean stickyUnreach;
    @Attribute(name = "config_pending", required = false)
    private Boolean configPending;
    @ElementList(inline = true)
    private List<Channel> channels;

    public Device() {
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

    public String getInterface() {
        return iface;
    }

    public void setInterface(String iface) {
        this.iface = iface;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Boolean getReadyConfig() {
        return readyConfig;
    }

    public void setReadyConfig(Boolean readyConfig) {
        this.readyConfig = readyConfig;
    }

    public Boolean isUnreach() {
        return unreach;
    }

    public void setUnreach(Boolean unreach) {
        this.unreach = unreach;
    }

    public Boolean isStickyUnreach() {
        return stickyUnreach;
    }

    public void setStickyUnreach(Boolean stickyUnreach) {
        this.stickyUnreach = stickyUnreach;
    }

    public Boolean isConfigPending() {
        return configPending;
    }

    public void setConfigPending(Boolean configPending) {
        this.configPending = configPending;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "Device{" + "name=" + name + ", address=" + address + ", iseId=" + iseId + ", interface=" + iface + ", deviceType=" + deviceType + ", readyConfig=" + readyConfig + ", unreach=" + unreach + ", stickyUnreach=" + stickyUnreach + ", configPending=" + configPending + ", channels=" + channels + '}';
    }

}
