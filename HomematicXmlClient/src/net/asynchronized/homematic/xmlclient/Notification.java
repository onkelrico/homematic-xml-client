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
public class Notification {
    @Attribute(name = "ise_id")
    private Integer iseId;
    @Attribute
    private String name;
    @Attribute
    private String type;
    @Attribute
    private Long timestamp;

    public Notification() {
    }

    public Integer getIseId() {
        return iseId;
    }

    public void setIseId(Integer iseId) {
        this.iseId = iseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Notification{" + "iseId=" + iseId + ", name=" + name + ", type=" + type + ", timestamp=" + timestamp + '}';
    }
    
}
