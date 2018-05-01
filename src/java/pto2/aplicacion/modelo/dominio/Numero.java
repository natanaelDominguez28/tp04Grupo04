/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto2.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Lore
 */
public class Numero implements Serializable{
    private double numero;

    public Numero() {
    }

    public Numero(double numero) {
        this.numero = numero;
    }
   
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    
}
