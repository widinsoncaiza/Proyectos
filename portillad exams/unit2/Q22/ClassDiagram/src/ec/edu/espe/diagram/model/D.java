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
public class D {
    private ArrayList <F> fs = new ArrayList <>();
    private E esArray[] = new E[5];

    @Override
    public String toString() {
        return "D{" + "fs=" + getFs() + ", esArray=" + getEsArray() + '}';
    }

    public D(ArrayList fs) {
        this.fs=fs;
        
    }

    /**
     * @return the fs
     */
    public ArrayList <F> getFs() {
        return fs;
    }

    /**
     * @param fs the fs to set
     */
    public void setFs(ArrayList <F> fs) {
        this.fs = fs;
    }

    /**
     * @return the esArray
     */
    public E[] getEsArray() {
        return esArray;
    }

    /**
     * @param esArray the esArray to set
     */
    public void setEsArray(E[] esArray) {
        this.esArray = esArray;
    }

    

    

    
}
