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
public class RssiList {
    @ElementList(inline = true)
    private List<Rssi> rssiList;

    public RssiList() {
    }

    public List<Rssi> getRssiList() {
        return rssiList;
    }

    public void setRssiList(List<Rssi> rssiList) {
        this.rssiList = rssiList;
    }

    @Override
    public String toString() {
        return "RssiList{" + "rssiList=" + rssiList + '}';
    }
    
}
