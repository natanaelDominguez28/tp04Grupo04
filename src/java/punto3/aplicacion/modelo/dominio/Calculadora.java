/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.aplicacion.modelo.dominio;

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
                case '+': resultado=sumar(numeroA, numeroB); 
                break;
                case '-': resultado=restar(numeroA, numeroB);
                break;
                case '*': resultado=multiplicar(numeroA, numeroB);
                break;
                case '/': resultado=dividir(numeroA, numeroB);
                break;
                case '^': resultado=potencia(numeroA, numeroB);
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
        if(numeroB>0){
            return numeroA / numeroB;
        }else{
            return 0;
        }  
    }
    
    public double potencia(double numeroA , double numeroB){
        double resultado;
        /*for (int i =0 ; i<numeroB; i++){
            resultado = resultado * numeroA;
        
        }*/
        resultado=Math.pow(numeroA, numeroB);
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
