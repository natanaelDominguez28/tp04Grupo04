package punto7.aplicacion.controlador.beans.forms;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto7.aplicacion.modelo.dominio.GestorLibro;

/**
 *
 * @author Emanuel L.
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    
    private GestorLibro gestor = new GestorLibro();
    
    public LibroFormBean() {
        this.gestor=new GestorLibro();
    }

    /**
     * @return the gestor
     */
    public GestorLibro getGestor() {
        return gestor;
    }

    /**
     * @param gestor the gestor to set
     */
    public void setGestor(GestorLibro gestor) {
        this.gestor = gestor;
    }
    
    

   

    
    
    
    
    
   
    
}
