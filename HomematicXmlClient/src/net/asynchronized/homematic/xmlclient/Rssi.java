/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import org.simpleframework.xml.Attribute;

/**
 *
 * @author enrico
 */
public class Rssi {
    @Attribute
    private String device;
    @Attribute
    private Integer rx;
    @Attribute
    private Integer tx;

    public Rssi() {
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public Integer getRx() {
        return rx;
    }

    public void setRx(Integer rx) {
        this.rx = rx;
    }

    public Integer getTx() {
        return tx;
    }

    public void setTx(Integer tx) {
        this.tx = tx;
    }

    @Override
    public String toString() {
        return "Rssi{" + "device=" + device + ", rx=" + rx + ", tx=" + tx + '}';
    }
    
}
