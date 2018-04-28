/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion.modelo.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import punto2.aplicacion.modelo.dominio.Numero;

/**
 *
 * @author natan
 */
public class ListaDeNumero implements Serializable{
    List<Numero> numeros;
    Numero n;
    
    
    public ListaDeNumero() {
        numeros = new ArrayList<>();
        n = new Numero();
    }

    public void agregarNumero(int valor){
        numeros.add(new Numero(valor));
    }
    
    public int calcularMayor(){
        int mayor=0;
        for(int i=1;i<numeros.size();i++){
            if(mayor<numeros.get(i).getValor()){
                mayor=numeros.get(i).getValor();
            }
        }
        return mayor;
    }
    
    public int calcularMenor(){
        int menor=0;
        for(int i=1;i<numeros.size();i++){
            menor=numeros.get(0).getValor();
            if(numeros.get(i).getValor()<menor){
                menor=numeros.get(i).getValor();
            }
        }
        return menor;
    }
    
    public double calcularPromedio(){
        double promedio=0.0;
        double suma=0.0;
        for(int i=0;i<numeros.size();i++){
            suma=suma+numeros.get(i).getValor();
            promedio=suma/numeros.size();
        }
        
        return promedio;
    }
    
    public List<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }

    public Numero getN() {
        return n;
    }

    public void setN(Numero n) {
        this.n = n;
    }

}
