/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto2.aplicacion.controlador.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto2.aplicacion.modelo.dominio.Numero;

/**
 *
 * @author Lore
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    double n;
    private List<Numero> listaNumero;
    private Numero nuevoNumero;

    public NumeroFormBean() {
       listaNumero= new ArrayList();
    }

    public NumeroFormBean(double n, List<Numero> listaNumero, Numero nuevoNumero) {
        this.n = n;
        this.listaNumero = listaNumero;
        this.nuevoNumero = nuevoNumero;
    }
    /**    

     * Creates a new instance of NumeroFormBean
     */
    
    public void cargarLista(){
        
        nuevoNumero=new Numero(n);
       
        this.listaNumero.add(nuevoNumero);
    }


    public List<Numero> getListaNumero() {
        return listaNumero;
    }

    public void setListaNumero(List<Numero> listaNumero) {
        this.listaNumero = listaNumero;
    }

    public Numero getNuevoNumero() {
        return nuevoNumero;
    }

    public void setNuevoNumero(Numero nuevoNumero) {
        this.nuevoNumero = nuevoNumero;
    }

   

    
}
