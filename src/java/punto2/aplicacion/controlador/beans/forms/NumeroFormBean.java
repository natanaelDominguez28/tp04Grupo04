/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import punto2.aplicacion.modelo.util.ListaDeNumero;

/**
 *
 * @author natan
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable{
    private ListaDeNumero lista;
    private int numero;
    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        lista = new ListaDeNumero();
    }

    public void registrarNumero(){
       lista.agregarNumero(numero);
    }
    
    public int obtenerMayor(){
        return lista.calcularMayor();
    }
    
    public int obtenerMenor(){
        return lista.calcularMenor();
    }
    
    public double obtenerPromedio(){
        return lista.calcularPromedio();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    public ListaDeNumero getLista() {
        return lista;
    }

    public void setLista(ListaDeNumero lista) {
        this.lista = lista;
    }
    
    
    
    
}
