/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion.controlador.beans.forms;

import punto2.aplicacion.modelo.util.ListaDeNumero;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author natan
 */
@ManagedBean
@ViewScoped
public class NumeroFormBean implements Serializable {
    
    private ListaDeNumero numeros;
    private int num;
    
    /**
     * Creates a new instance of NumeroFormBean
     */
    public NumeroFormBean() {
        numeros = new ListaDeNumero();
    }

    public void registrarNumero(){
        numeros.agregarNumero(num);
    }
    
    public int obtenerMayor(){
        return numeros.calcularMayor();
    }
    
    public int obtenerMenor(){
        return numeros.calcularMenor();
    }
    
    public double obtenerPromedio(){
        return numeros.calcularPromedio();
    }
    public ListaDeNumero getNumeros() {
        return numeros;
    }

    public void setNumeros(ListaDeNumero numeros) {
        this.numeros = numeros;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
