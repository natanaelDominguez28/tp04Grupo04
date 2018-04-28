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
    
    public double convertirGradosCelsiusAfahrenheit(double valorTemperatura){
        return (valorTemperatura*1.8)+32;
    }
    
    public double convertirGradosCelsiusAkelvin(double valorTemperatura){
        return valorTemperatura+273.15;
    }
    
    /*public double convertirFahrenheitAgradosCelsius(double valorTemperatura){
        return (valorTemperatura-32)*(5/9);
    }
    
    public double convertirFahrenheitAkelvin(double valorTemperatura){
        return (valorTemperatura+459.67)*(5/9);
    }
    
    public double convertirKelvinAgradosCelsius(double valorTemperatura){
        return valorTemperatura-273.15;
    }
    
    public double convertirKelvinAfahrenheit(double valorTemperatura){
        return (valorTemperatura*1.8)-459.67;
    }*/
    
}
