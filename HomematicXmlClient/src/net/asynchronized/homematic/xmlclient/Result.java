/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.asynchronized.homematic.xmlclient;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

/**
 *
 * @author enrico
 */
@Root
public class Result {
    @ElementListUnion({
        @ElementList(inline = true, entry = "changed", type=Changed.class),
        @ElementList(inline = true, entry = "started", type=Started.class)
    })
    private List<OperationResult> operationResult;

    
    public Result() {
    }

    public List<OperationResult> getOperationResult() {
        return operationResult;
    }

    public void setOperationResult(List<OperationResult> operationResult) {
        this.operationResult = operationResult;
    }

    @Override
    public String toString() {
        return "Result{" + "operationResult=" + operationResult + '}';
    }

}
