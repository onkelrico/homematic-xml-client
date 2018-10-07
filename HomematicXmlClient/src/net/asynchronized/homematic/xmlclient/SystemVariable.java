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
public class SystemVariable {

    @Attribute
    private String name;
    @Attribute
    private Integer variable;
    @Attribute
    private String value;
    @Attribute(name = "value_text", required = false)
    private String valueText;
    @Attribute(name = "value_list")
    private String valueList;
    @Attribute(name = "ise_id")
    private Integer iseId;
    @Attribute
    private String min;
    @Attribute
    private String max;
    @Attribute
    private String unit;
    @Attribute
    private String type;
    @Attribute
    private String subtype;
    @Attribute(required = false)
    private Boolean logged;
    @Attribute(required = false)
    private Boolean visible;
    @Attribute
    private Long timestamp;
    @Attribute(name = "value_name_0")
    private String valueName0;
    @Attribute(name = "value_name_1")
    private String valueName1;

    public SystemVariable() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVariable() {
        return variable;
    }

    public void setVariable(Integer variable) {
        this.variable = variable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueText() {
        return valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }

    public String getValueList() {
        return valueList;
    }

    public void setValueList(String valueList) {
        this.valueList = valueList;
    }

    public Integer getIseId() {
        return iseId;
    }

    public void setIseId(Integer iseId) {
        this.iseId = iseId;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public Boolean getLogged() {
        return logged;
    }

    public void setLogged(Boolean logged) {
        this.logged = logged;
    }

    public Boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getValueName0() {
        return valueName0;
    }

    public void setValueName0(String valueName0) {
        this.valueName0 = valueName0;
    }

    public String getValueName1() {
        return valueName1;
    }

    public void setValueName1(String valueName1) {
        this.valueName1 = valueName1;
    }

    @Override
    public String toString() {
        return "SystemVariable{" + "name=" + name + ", variable=" + variable + ", value=" + value + ", valueText=" + valueText + ", valueList=" + valueList + ", iseId=" + iseId + ", min=" + min + ", max=" + max + ", unit=" + unit + ", type=" + type + ", subtype=" + subtype + ", logged=" + logged + ", visible=" + visible + ", timestamp=" + timestamp + ", valueName0=" + valueName0 + ", valueName1=" + valueName1 + '}';
    }
 
}
