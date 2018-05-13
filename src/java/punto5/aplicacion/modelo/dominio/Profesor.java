/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Lore
 */
public class Profesor implements Serializable{
  private String legajo;
    private String nombre;
    private String apellido;
    private int dni;
    private Date fechaNacimiento;
   
    
    public Profesor() {
    }

    public Profesor(String legajo, String nombre, String apellido, int dni, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }


  
    
    

@Override
    
 public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        return "Legajo: " + legajo +
                "Nombre: " + nombre +
                " Apellido: " + apellido +
                "Dni: " + getDni() +
                "FechaNacimiento: " + getFechaNacimiento();
    } 
 
 
 /**
     * @return the legajo
     */
    public String getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

   
   
}

