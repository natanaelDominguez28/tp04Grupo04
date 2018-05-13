
package pto5.aplicacion.controlador.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import pto5.aplicacion.modelo.dominio.GestorProfesor;

/**
 *
 * @author Emanuel L.
 */
@ManagedBean
@RequestScoped
public class profeFormBean {
    private GestorProfesor gestor;

    public profeFormBean() {
        gestor = new GestorProfesor();
    }

    public GestorProfesor getGestor() {
        return gestor;
    }

    public void setGestor(GestorProfesor gestor) {
        this.gestor = gestor;
    }

    

    
    
    
    
   
    

}
