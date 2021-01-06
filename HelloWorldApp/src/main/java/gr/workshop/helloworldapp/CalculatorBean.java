/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.workshop.helloworldapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
//import javax.ejb.Stateless;



//Not a manage Bean but a simple Bean object


@Stateful //like sessionScoped
public class CalculatorBean implements Serializable{
    // Data members calculator
    CalculatorData calculatorData;
    
    private List<CalculatorData> CalculatorDataHistory;

    
    public CalculatorBean() {
        calculatorData = new CalculatorData(10.0,5.0,'+');
        
        CalculatorDataHistory = new ArrayList<>();
    }

    public CalculatorData getCalculatorData() {
        return calculatorData;
    }

    public void setCalculatorData(CalculatorData calculatorData) {
        this.calculatorData = calculatorData;
    }
    
    

    
    
    
    public void calculateAction() {
        switch (calculatorData.getSymbol()) {
            case '+': calculatorData.setResult(calculatorData.getA()+calculatorData.getB());
                      break;
            case '-': calculatorData.setResult(calculatorData.getA()-calculatorData.getB());
                      break;
            case '*': calculatorData.setResult(calculatorData.getA()*calculatorData.getB());
                      break;
            case '/': calculatorData.setResult(calculatorData.getA()/calculatorData.getB());
                      break;
                      
            default: calculatorData.setResult(0.0);
        }
        
        CalculatorData cd =new CalculatorData(calculatorData.getA(), calculatorData.getB(), calculatorData.getSymbol(), calculatorData.getResult());
        CalculatorDataHistory.add(cd);
    }

    public List<CalculatorData> getCalculatorDataHistory() {
        return CalculatorDataHistory;
    }
    
    
}
