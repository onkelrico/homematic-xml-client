/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enrico
 */
public class DeviceType {

    private String code;
    private String description;

    private DeviceType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public static DeviceType getByCode(String code) {
        DeviceType type = new DeviceType(code, "unknown");
        Properties props = new Properties();
        try {
            props.load(DeviceType.class.getResourceAsStream("device_type_mapping.properties"));
        } catch (IOException ex) {
            Logger.getLogger(DeviceType.class.getName()).log(Level.SEVERE, null, ex);
        }
        String description = props.getProperty(code);
        if (description != null) {
            type.setDescription(description);
        }

        return type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "DeviceType{" + "code=" + code + ", description=" + description + '}';
    }
}
