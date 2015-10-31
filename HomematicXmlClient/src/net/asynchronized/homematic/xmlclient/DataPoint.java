/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 *
 * @author enrico
 */
@Root(name = "datapoint")
public class DataPoint {
    @Attribute(required = false)
    private String name;
    @Attribute(required = false)
    private String type;
    @Attribute(name = "ise_id")
    private Integer iseId;
    @Attribute
    private String value;
    @Attribute(name = "valuetype", required = false)
    private Integer valueType;
    @Attribute(name = "valueunit", required = false)
    private String valueUnit;
    @Attribute(required = false)
    private Long timestamp;
    @Attribute(required = false)
    private Integer operations;

    public DataPoint() {
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

    public Integer getIseId() {
        return iseId;
    }

    public void setIseId(Integer iseId) {
        this.iseId = iseId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getOperations() {
        return operations;
    }

    public void setOperations(Integer operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "DataPoint{" + "name=" + name + ", type=" + type + ", iseId=" + iseId + ", value=" + value + ", valueType=" + valueType + ", valueUnit=" + valueUnit + ", timestamp=" + timestamp + ", operations=" + operations + '}';
    }
    
}
