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
public class SystemProtocol {
    @ElementList(inline = true, entry = "records")
    private List<Record> recordList;

    public SystemProtocol() {
    }

    public List<Record> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<Record> recordList) {
        this.recordList = recordList;
    }

    @Override
    public String toString() {
        return "SystemProtocol{" + "recordList=" + recordList + '}';
    }
    
}
