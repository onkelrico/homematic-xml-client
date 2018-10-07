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
public class Record {
    @Attribute
    private Integer start;
    @Attribute
    private Integer show;
    @Attribute
    private Integer count;

    public Record() {
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getShow() {
        return show;
    }

    public void setShow(Integer show) {
        this.show = show;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Record{" + "start=" + start + ", show=" + show + ", count=" + count + '}';
    }
    
}
