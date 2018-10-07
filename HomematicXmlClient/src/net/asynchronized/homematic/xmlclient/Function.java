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
public class Function {
    @Attribute
    private String name;
    @Attribute
    private String description;
    @Attribute(name = "ise_id")
    private String iseId;
    @ElementList(inline = true, required = false)
    private List<Channel> channels;

    public Function() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Function{" + "name=" + name + ", description=" + description + ", iseId=" + iseId + ", channels=" + channels + '}';
    }

}
