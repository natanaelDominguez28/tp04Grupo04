package pto5.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 * 
 * @author Emanuel L.
 */
public class GestorProfesor implements Serializable{

    private Profesor profesor;
    public GestorProfesor() {
        profesor = new Profesor();
    
    }
    
    
    public Profesor getProfesor() {
        return profesor;
        
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    

}
