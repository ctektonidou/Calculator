/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.workshop.helloworldapp;

import java.util.Objects;

/**
 *
 * @author Marios
 */
public class CalculatorData {
    private Double a;
    private Double b;
    private Character symbol;
    private Double result;
    
    
    

    public CalculatorData(Double a, Double b, Character symbol, Double result) {
        this.a = a;
        this.b = b;
        this.symbol = symbol;
        this.result = result;
    }
    
    public CalculatorData(Double a, Double b, Character symbol) {
        this.a = a;
        this.b = b;
        this.symbol = symbol;
        this.result = 0.0;
    }
    
    
    
    
    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CalculatorData{" + "a=" + a + ", b=" + b + ", symbol=" + symbol + ", result=" + result + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.a);
        hash = 89 * hash + Objects.hashCode(this.b);
        hash = 89 * hash + Objects.hashCode(this.symbol);
        hash = 89 * hash + Objects.hashCode(this.result);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CalculatorData other = (CalculatorData) obj;
        if (!Objects.equals(this.a, other.a)) {
            return false;
        }
        if (!Objects.equals(this.b, other.b)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        return true;
    }
    
    
    
}
