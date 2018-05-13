/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.aplicacion.controlador.formbean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import punto5.aplcacion.controlador.bean.ProfesorBean;

/**
 *
 * @author SONY
 */
@ManagedBean
@ViewScoped
public class ProfesorFormBean implements Serializable{
    
     @ManagedProperty ( value ="#{profesorBean}" )
     private ProfesorBean profesorBean;

    /**
     * Creates a new instance of ProfesorFormBean
     */
    public ProfesorFormBean() {
    }
    
     //metodo no usado.....
    public String enviar(){
        return "mostrarprofesor";
    }

    /**
     * @return the profesorBean
     */
    public ProfesorBean getProfesorBean() {
        return profesorBean;
    }

    /**
     * @param profesorBean the profesorBean to set
     */
    public void setProfesorBean(ProfesorBean profesorBean) {
        this.profesorBean = profesorBean;
    }
    
}
