/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import java.util.List;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

/**
 *
 * @author enrico
 */
public class Room {
    @Attribute
    private String name;
    @Attribute(name = "ise_id")
    private String iseId;
    @ElementList(inline = true, required = false)
    private List<Channel> channels;

    public Room() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIseId() {
        return iseId;
    }

    public void setIseId(String iseId) {
        this.iseId = iseId;
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", iseId=" + iseId + ", channels=" + channels + '}';
    }
    
}
