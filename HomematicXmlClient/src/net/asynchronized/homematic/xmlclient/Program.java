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
public class Program {

    @Attribute
    private Integer id;
    @Attribute
    private String name;
    @Attribute
    private Boolean active;
    @Attribute
    private Long timestamp;
    @Attribute
    private String description;
    @Attribute
    private Boolean visible;
    @Attribute
    private Boolean operate;

    public Program() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getOperate() {
        return operate;
    }

    public void setOperate(Boolean operate) {
        this.operate = operate;
    }

    @Override
    public String toString() {
        return "Program{" + "id=" + id + ", name=" + name + ", active=" + active + ", timestamp=" + timestamp + ", description=" + description + ", visible=" + visible + ", operate=" + operate + '}';
    }

}
