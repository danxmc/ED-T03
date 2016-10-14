/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.t03;

/**
 *
 * @author danx_
 */
public class nodeClass<T> {
    //Atributes
    private T data;
    private nodeClass next;
    
    //Constructor
    public nodeClass(T d) {
        this.data = d;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public nodeClass getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(nodeClass next) {
        this.next = next;
    }
    
}
