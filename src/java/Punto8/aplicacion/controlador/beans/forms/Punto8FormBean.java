package Punto8.aplicacion.controlador.beans.forms;

import Punto8.aplicacion.modelo.dominio.GestorLibro;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author Emanuel L.
 */
@ManagedBean
@ViewScoped
public class Punto8FormBean implements Serializable{
    
    private GestorLibro gestorLibro;
    
    public Punto8FormBean() {
        this.gestorLibro = new GestorLibro();
    }

    public GestorLibro getGestorLibro() {
        return gestorLibro;
    }

    public void setGestorLibro(GestorLibro gestorLibro) {
        this.gestorLibro = gestorLibro;
    }
    
    
    
    

   
    
   
    
}
