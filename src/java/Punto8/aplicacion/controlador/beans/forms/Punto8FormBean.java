package Punto8.aplicacion.controlador.beans.forms;

import Punto8.aplicacion.modelo.dominio.GestorLibro;
import Punto8.aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
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
    private Libro unLibro;
    private Libro libro;
    private Libro unLibro1;
    
    private String ISBN1;
    private String titulo1;
    private double precio1;
    private String autor1;

    /**
    * Creates a new instance of gestorLibrosFormBean
    */
    public Punto8FormBean() {
        //instancear crear un objeto
        gestorLibro = new GestorLibro();
        unLibro = new Libro();
        
    }
    
    public void agregarLibro(){
        //gestorLibros.addLibro(libro);
        //reseteo el objeto libro del managed bean
        //para que ahora el libro mapeado al form sea uno nuevo (vacio)
        setUnLibro(new Libro(getISBN1(),getTitulo1(),getAutor1(),getPrecio1()));
        gestorLibro.addUnLibro(unLibro);
        //libro = new Libro();
    }
    
    
    public ArrayList<Libro> getLibros(){
        return (ArrayList<Libro>) gestorLibro.getLibros();
    }
    
    public void buscarLibro(){
        for (Libro libro: gestorLibro.getLibros()){
            if(libro.getTitulo().equals(titulo1)){
                //gestorLibros.addUnLibro1(unLibro1);
                gestorLibro.getLibrosBuscados().add(libro);
            }
        }
    }

    /**
     * @return the gestorLibros
     */
    public GestorLibro getGestorLibro() {
        return gestorLibro;
    }

    /**
     * @param gestorLibro the gestorLibros to set
     */
    public void setGestorLibro(GestorLibro gestorLibro) {
        this.gestorLibro = gestorLibro;
    }

    /**
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    /**
     * @return the ISBN1
     */
    public String getISBN1() {
        return ISBN1;
    }

    /**
     * @param ISBN1 the ISBN1 to set
     */
    public void setISBN1(String ISBN1) {
        this.ISBN1 = ISBN1;
    }

    /**
     * @return the titulo1
     */
    public String getTitulo1() {
        return titulo1;
    }

    /**
     * @param titulo1 the titulo1 to set
     */
    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    /**
     * @return the precio1
     */
    public double getPrecio1() {
        return precio1;
    }

    /**
     * @param precio1 the precio1 to set
     */
    public void setPrecio1(double precio1) {
        this.precio1 = precio1;
    }

    /**
     * @return the autor1
     */
    public String getAutor1() {
        return autor1;
    }

    /**
     * @param autor1 the autor1 to set
     */
    public void setAutor1(String autor1) {
        this.autor1 = autor1;
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
     * @return the unLibro1
     */
    public Libro getUnLibro1() {
        return unLibro1;
    }

    /**
     * @param unLibro1 the unLibro1 to set
     */
    public void setUnLibro1(Libro unLibro1) {
        this.unLibro1 = unLibro1;
    }
   
}
