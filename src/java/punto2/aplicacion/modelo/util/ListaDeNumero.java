/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion.modelo.util;

import punto2.aplicacion.modelo.dominio.Numero;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natan
 */
public class ListaDeNumero implements Serializable{
    List<Numero> listaDeNumero;

    public ListaDeNumero(List<Numero> listaDeNumero) {
        this.listaDeNumero = listaDeNumero;
    }

    public ListaDeNumero() {
        listaDeNumero = new ArrayList<>();
    }
    
    public void agregarNumero(int valor){
        listaDeNumero.add(new Numero(valor));
    }
    
    public int calcularMayor(){
        int mayor=0;
        for(int i=1;i<listaDeNumero.size();i++){
            if(mayor<listaDeNumero.get(i).getNumero()){
                mayor=listaDeNumero.get(i).getNumero();
            }
        }
        return mayor;
    }
    
    public int calcularMenor(){
        int menor=0;
        for(int i=1;i<listaDeNumero.size();i++){
            menor=listaDeNumero.get(0).getNumero();
            if(listaDeNumero.get(i).getNumero()<menor){
                menor=listaDeNumero.get(i).getNumero();
            }
        }
        return menor;
    }
    
    public double calcularPromedio(){
        double promedio=0.0;
        double suma=0.0;
        for(int i=0;i<listaDeNumero.size();i++){
            suma=suma+listaDeNumero.get(i).getNumero();
            promedio=suma/listaDeNumero.size();
        }
        
        return promedio;
    }

    public List<Numero> getListaDeNumero() {
        return listaDeNumero;
    }

    public void setListaDeNumero(List<Numero> listaDeNumero) {
        this.listaDeNumero = listaDeNumero;
    }
    
    
    

    
    
}
