/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author Lore
 */
public class Calculadora implements Serializable{
    private double numeroA;
    private double numeroB;
    private char operador;
    
    public double realizarOperacion(double numeroA, double numeroB, char operador){
        double resultado = 0;
        
        switch(operador){
                case '+': resultado= numeroA + numeroB; 
                break;
                case '-': resultado= numeroA - numeroB;
                break;
                case '*': resultado=numeroA * numeroB;
                break;
                case '/': resultado= numeroA / numeroB;
                break;
                case '^': {
                    resultado = 1;
                        for (int i =0 ; i<numeroB; i++){
                            resultado = resultado * numeroA;             
                        }
                }
                break;
            }
        return resultado;    
    }
    
    public double sumar(double numeroA, double numeroB){
        return numeroA+numeroB;
    }   

    public double restar(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }

    public double multiplicar(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }

    public double dividir(double numeroA, double numeroB) {

        return numeroA / numeroB;
    }
    
    public double potencia(double numeroA , double numeroB){
        double resultado = 1;
        for (int i =0 ; i<numeroB; i++){
            resultado = resultado * numeroA;
        
        }
     return resultado;       
    }
    
    
    
    /*public double getNumeroA() {
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
    
}
