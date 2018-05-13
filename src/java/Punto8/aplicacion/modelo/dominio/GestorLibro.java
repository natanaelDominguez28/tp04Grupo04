package Punto8.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author Emanuel L.
 */
public class GestorLibro implements Serializable{
    private Libro libro = new Libro();
    private ArrayList<Libro> listaLibro = new ArrayList<Libro>();
    private ArrayList<Libro> listaLibroBuscado = new ArrayList<Libro>();
    private String autorBuscado;

    
    public GestorLibro (){
        this.libro=new Libro();
        this.listaLibro=new ArrayList<Libro>();
        
        listaLibro.add(new Libro("A123", "Harry Potter", "J.K.Rowling", 712));
        listaLibro.add(new Libro("B777", "Games of Thrones", "George R.R.Martin", 4520));
        listaLibro.add(new Libro("C453", "Soy Leyenda", "Richard Matheson", 320));
    }
    
    public void agregarLibro() {
        listaLibro.add(getLibro());
        libro = new Libro();
    }

    public void buscarLibroPorAutor(){
        
        System.out.println(autorBuscado);
        listaLibroBuscado = new ArrayList<>();
        for(Libro l:listaLibro){
            if(autorBuscado.equals(l.getAutor())){
                System.out.println("agregado");
                listaLibroBuscado.add(l);
            }
        }
        listaLibro = listaLibroBuscado;
    }
    
    
    
    
    
    
    
    public ArrayList<Libro> getListaLibroBuscado() {
        return listaLibroBuscado;
    }

    public void setListaLibroBuscado(ArrayList<Libro> listaLibroBuscado) {
        this.listaLibroBuscado = listaLibroBuscado;
    }
    

    public String getAutorBuscado() {
        return autorBuscado;
    }

    public void setAutorBuscado(String autorBuscado) {
        this.autorBuscado = autorBuscado;
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
