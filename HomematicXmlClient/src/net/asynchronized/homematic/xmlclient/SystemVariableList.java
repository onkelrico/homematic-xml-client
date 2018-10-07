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
public class SystemVariableList {
    @ElementList(inline = true)
    private List<SystemVariable> variables;

    public SystemVariableList() {
    }

    public List<SystemVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<SystemVariable> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        return "SystemVariableList{" + "variables=" + variables + '}';
    }
    
    
}
