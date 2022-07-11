/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class B extends A {
    private ArrayList <H> hs = new ArrayList <>(); 

    public B(ArrayList hs) {
        this.hs = hs;
        
    }

    @Override
    public String toString() {
        return "B{" + super.toString() + "hs=" + hs + '}';
    }

    /**
     * @return the hs
     */
    public ArrayList <H> getHs() {
        return hs;
    }

    /**
     * @param hs the hs to set
     */
    public void setHs(ArrayList <H> hs) {
        this.hs = hs;
    }
    
    
    
}
    

