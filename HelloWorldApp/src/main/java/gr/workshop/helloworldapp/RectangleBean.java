/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.workshop.helloworldapp;

import java.io.Serializable;
import javax.ejb.Stateful;

/**
 *
 * @author Marios
 */

@Stateful //like sesionScoped
public class RectangleBean implements Serializable{
    
    //Data members rectangle
    private Integer mikos;
    private Integer platos;
    private Integer area;

    public RectangleBean() {
        mikos=10;
        platos= new Integer("10");
        area=0;
    }

    public Integer getMikos() {
        return mikos;
    }

    public void setMikos(Integer mikos) {
        this.mikos = mikos;
    }

    public Integer getPlatos() {
        return platos;
    }

    public void setPlatos(Integer platos) {
        this.platos = platos;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
    
    public void calculateAreaAction() {
        area= mikos*platos;
    } 
    
}
