/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author SONY
 */
public class Auto implements Serializable{
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipoCompustibe;

    public Auto() {
    }

    public Auto(String patente, String marca, String modelo, String color, String tipoCompustibe) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCompustibe = tipoCompustibe;
    }
    
    
    
   

    /**
     * @return the patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente the patente to set
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the tipoCompustibe
     */
    public String getTipoCompustibe() {
        return tipoCompustibe;
    }

    /**
     * @param tipoCompustibe the tipoCompustibe to set
     */
    public void setTipoCompustibe(String tipoCompustibe) {
        this.tipoCompustibe = tipoCompustibe;
    }
    
    
    
    
}
