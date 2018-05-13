/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto1.aplicacion.modelo.dominio.ConversorDeTemperatura;

/**
 *
 * @author natan
 */
@ManagedBean
@ViewScoped
public class ConversorDeTemperaturaFormBean implements Serializable {

    /*private ConversorDeTemperatura conversor;
    private double temperatura;*/
    private double n;
    private ConversorDeTemperatura conversorDeTemperatura;
    private char unidadOrigen;
    private char unidadDestino;

    /**
     * Creates a new instance of ConversorDeTemperaturaFormBean
     */
    public ConversorDeTemperaturaFormBean() {
        //conversor = new ConversorDeTemperatura();
    }

    /*public double obtenerTemperaturaEnFahrenheit(){
        return conversor.convertirGradosCelsiusAfahrenheit(temperatura);
    }
    
    public double obtenerTemperaturaEnKelvin(){
        return conversor.convertirGradosCelsiusAkelvin(temperatura);
    }
    
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public ConversorDeTemperatura getConversor() {
        return conversor;
    }

    public void setConversor(ConversorDeTemperatura conversor) {
        this.conversor = conversor;
    }*/
    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public ConversorDeTemperatura getConversorDeTemperatura() {
        return conversorDeTemperatura;
    }

    public void setConversorDeTemperatura(ConversorDeTemperatura conversorDeTemperatura) {
        this.conversorDeTemperatura = conversorDeTemperatura;
    }

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }

    public double convertirUnidades() {
        double resultado = 0;
        ConversorDeTemperatura conversor = new ConversorDeTemperatura();
        conversor.asignarUnValor(n);
        if (unidadOrigen == 'C' && unidadDestino == 'F') {
            resultado = conversor.obtenerCelsiusDeFahrenheit();
        }
        if (unidadOrigen == 'C' && unidadDestino == 'K') {
            resultado = conversor.obtenerCelsiusDeKelvin();
        }
        if (unidadOrigen == 'F' && unidadDestino == 'C') {
            resultado = conversor.convertirFahrenheitAgradosCelsius();
        }
        if (unidadOrigen == 'F' && unidadDestino == 'K') {
            resultado = conversor.convertirFahrenheitAkelvin();
        }
        if (unidadOrigen == 'K' && unidadDestino == 'C') {
            resultado = conversor.convertirKelvinAgradosCelsius();
        }
        if (unidadOrigen == 'K' && unidadDestino == 'F') {
            resultado = conversor.convertirKelvinAfahrenheit();
        }
        
        return resultado ;
    }
    
}

