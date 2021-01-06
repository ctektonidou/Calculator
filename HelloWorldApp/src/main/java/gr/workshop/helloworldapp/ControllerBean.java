/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.workshop.helloworldapp;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author dell
 */

//Annotation, if wasn't annotated then it would be plain old java object POJO
//SessionScoped(login,basket eshop, etc.) -- RequestScoped (mainly at queries in database) -- ApplicationScoped
@Named(value = "controllerBean")
@SessionScoped
public class ControllerBean implements Serializable {
    
    //Inject the Calculator Bean and the Rectangle Bean
    @Inject
    CalculatorBean calculatorBean;
    
    @Inject
    RectangleBean rectangleBean;
    
    
    
    /**
     * Creates a new instance of ControllerBean
     */
    
    //Constructor of Manage Bean
    public ControllerBean() {
        }

    
    
    
    //We need getters of the simple Beans Calculator and rectangle to call them to our xhtmls
    
    public CalculatorBean getCalculatorBean() {
        return calculatorBean;
    }

    public RectangleBean getRectangleBean() {
        return rectangleBean;
    }
    
    

    
    /**
     * Dynamic Navigation
     * @return 
     */
    public String gotoCalculatorAction() {
        return "/calculator";
    }
    public String gotoRectangleAction() {
        return "/rectangle";
    }    
    
    public String gotoPageAction(String jsfPage) {
        return "/"+jsfPage;
    }      
}
