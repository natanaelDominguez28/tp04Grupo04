/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author natan
 */
public class ConversorDeTemperatura implements Serializable{
    
    private double numero;
    
    public void asignarUnValor(double num){
        this.setNumero(num);
    }
    
    public double obtenerCelsiusDeFahrenheit(){
        return 1.8*numero+32;
    }
    
    public double obtenerCelsiusDeKelvin(){
        return numero+273.15;
    }
    
    
    public double convertirFahrenheitAgradosCelsius(){
        return (numero-32)*(5/9);
    }
    
    public double convertirFahrenheitAkelvin(){
          return (numero-273.15)*1.8+32;
    }
    
    public double convertirKelvinAgradosCelsius(){
        return numero-273.15;
    }
    
    public double convertirKelvinAfahrenheit(){
        return numero-32+273.15/1.8;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
}
