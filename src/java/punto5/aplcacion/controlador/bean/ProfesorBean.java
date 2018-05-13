/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.aplcacion.controlador.bean;

import punto5.aplicacion.modelo.dominio.Profesor;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Lore
 */
@ManagedBean
@SessionScoped
public class ProfesorBean implements Serializable{
    private Profesor profesor;
    

    /**
     * Creates a new instance of ProfesorBean
     */
    public ProfesorBean() {
        profesor=new Profesor ();
    }
    

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
}

