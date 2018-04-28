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
public class ConversorDeTemperaturaFormBean implements Serializable{
    private ConversorDeTemperatura conversor;
    private double temperatura;
    /**
     * Creates a new instance of ConversorDeTemperaturaFormBean
     */
    public ConversorDeTemperaturaFormBean() {
        conversor = new ConversorDeTemperatura();
    }

    public double obtenerTemperaturaEnFahrenheit(){
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
    }
    
    
    
}
