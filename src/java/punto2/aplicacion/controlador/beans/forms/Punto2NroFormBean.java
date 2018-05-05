package punto2.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import punto2.aplicacion.modelo.dominio.GestorArreglo;

/**
 *
 * @author EmanuelL
 */
@ManagedBean
@ViewScoped
public class Punto2NroFormBean implements Serializable{
    GestorArreglo gestor = new GestorArreglo();

    /**
     * Creates a new instance of Punto2FormBean
     */
    public Punto2NroFormBean() {
        gestor = new GestorArreglo();
    }

    public GestorArreglo getGestor() {
        return gestor;
    }

    public void setGestor(GestorArreglo gestor) {
        this.gestor = gestor;
    }
    
}
