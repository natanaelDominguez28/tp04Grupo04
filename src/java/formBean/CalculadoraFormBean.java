/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formBean;

import dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Lore
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private double numeroA;
    private double numeroB;
    private char operador;
    private Calculadora calculadora;

    /**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
        calculadora=new Calculadora();
        
        
      
    }
    
    public double calcularOperacion(){
        return calculadora.realizarOperacion(numeroA, numeroB, operador);
    }
    
    /*public double sumar(){
        return calculadora.sumar(numeroA, numeroB);
        
    }
    
    public double restar(){
        return calculadora.restar(numeroA, numeroB);
    }
    
    public double multiplicar(){
        return calculadora.multiplicar(numeroA, numeroB);
    }
    
    public double dividir(){
        return calculadora.dividir(numeroA, numeroB);
    }
    
    public double potencia(){
        return calculadora.potencia(numeroA, numeroB);
    }*/
    
    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    
}
