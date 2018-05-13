
package punto7.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author Emanuel L.
 */
public class GestorLibro implements Serializable{
    private Libro libro = new Libro();
    private ArrayList<Libro> listaLibro = new ArrayList<Libro>();
    
    
    public GestorLibro (){
        this.libro=new Libro();
        this.listaLibro=new ArrayList<Libro>();
        
        listaLibro.add(new Libro("A123", "Harry Potter", "J.K.Rowling", 112));
        listaLibro.add(new Libro("B777", "Games of Thrones", "George R.R.Martin", 4520));
    }
    
    
    public void agregarLibro() {
       listaLibro.add(getLibro());
       libro= new Libro();
        
    }

    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public ArrayList<Libro> getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }
}
