package Punto8.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Emanuel L.
 */
public class GestorLibro implements Serializable{
    private Libro libro;
    private List<Libro> libros;
    private List<Libro> librosBuscados;
    
    public GestorLibro(List<Libro> libros) {
        this.libros = libros;
    }
    
    public GestorLibro() {
        // libro=new Libro(); sino se instancia sale nullpointer
        libros = new ArrayList();
        librosBuscados = new ArrayList();
         libros.add(new Libro("A123", "Harry Potter", "J.K.Rowling", 712));
        libros.add(new Libro("B777", "Games of Thrones", "George R.R.Martin", 4520));
        libros.add(new Libro("C453", "Soy Leyenda", "Richard Matheson", 320));
    }
    
    public void addUnLibro(Libro unLibro) {
        libros.add(unLibro);
    }
    
    

    public void deleteUnLibro(Libro unLibro) {
        libros.remove(unLibro);
    }
       

    /**
     * @return the libro
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * @return the libros
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * @param libros the libros to set
     */
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * @return the librosBuscados
     */
    public List<Libro> getLibrosBuscados() {
        return librosBuscados;
    }

    /**
     * @param librosBuscados the librosBuscados to set
     */
    public void setLibrosBuscados(List<Libro> librosBuscados) {
        this.librosBuscados = librosBuscados;
    }
    
    
}
