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
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public Numero() {
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
