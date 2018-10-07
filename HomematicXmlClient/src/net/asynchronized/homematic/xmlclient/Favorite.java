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
public class Favorite {
    @Attribute
    private String name;
    @Attribute(name = "ise_id")
    private String iseId;

    public Favorite() {
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

    @Override
    public String toString() {
        return "Favorite{" + "name=" + name + ", iseId=" + iseId + '}';
    }
    
    
}
