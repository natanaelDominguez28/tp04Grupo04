/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author natan
 */
public class Numero implements Serializable{
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public Numero() {
    }
 
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
