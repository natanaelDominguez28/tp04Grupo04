/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pto5.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * 
 * @author Emanuel L.
 */
public class Profesor implements Serializable{
    
     private String legajo;
    private String apellido;
    private String nombres;

    public void Profesor(){
        
    }
    
    
    
    
    public String getLegajo() {
        return legajo;
    }

    
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    
    public String getApellido() {
        return apellido;
    }

    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   
    public String getNombres() {
        return nombres;
    }

    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
