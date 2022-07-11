/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.diagram.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class G implements H{
    private J j;
    private int a1;

    public G(J j, int a1) {
        this.j = j;
        this.a1 = a1;
    }

    @Override
    public String toString() {
        return "G{" + "j=" + getJ() + ", a1=" + getA1() + '}';
    }
    
    public J m(int ai){
       return getJ(); 
    }

    /**
     * @return the j
     */
    public J getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(J j) {
        this.j = j;
    }

    /**
     * @return the a1
     */
    public int getA1() {
        return a1;
    }

    /**
     * @param a1 the a1 to set
     */
    public void setA1(int a1) {
        this.a1 = a1;
    }
    
}
