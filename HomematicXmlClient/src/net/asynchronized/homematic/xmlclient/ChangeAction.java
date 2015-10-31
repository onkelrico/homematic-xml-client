/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

/**
 *
 * @author enrico
 */
public class ChangeAction {
    private Integer iseId;
    private String newValue;

    public ChangeAction() {
    }

    public ChangeAction(Integer iseId, String newValue) {
        this.iseId = iseId;
        this.newValue = newValue;
    }

    public Integer getIseId() {
        return iseId;
    }

    public void setIseId(Integer iseId) {
        this.iseId = iseId;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    @Override
    public String toString() {
        return "ChangeAction{" + "iseId=" + iseId + ", newValue=" + newValue + '}';
    }
    
}
