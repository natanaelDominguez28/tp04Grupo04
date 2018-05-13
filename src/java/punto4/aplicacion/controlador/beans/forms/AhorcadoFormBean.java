/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import punto4.aplicacion.modelo.dominio.Ahorcado;


/**
 *
 * @author SONY
 */
@ManagedBean
@ViewScoped
public class AhorcadoFormBean implements Serializable{
private boolean componenteDeshabilitado;
    private String palabraIngresada;
    private char letraIngresada;
    private Ahorcado juegoAhorcado;

    public AhorcadoFormBean() {
        juegoAhorcado = new Ahorcado();
        componenteDeshabilitado = false;
    }

    /**
     * @return the componenteDeshabilitado
     */
    public boolean isComponenteDeshabilitado() {
        return componenteDeshabilitado;
    }

    /**
     * @param componenteDeshabilitado the componenteDeshabilitado to set
     */
    public void setComponenteDeshabilitado(boolean componenteDeshabilitado) {
        this.componenteDeshabilitado = componenteDeshabilitado;
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    /**
     * @return the juegoAhorcado
     */
    public Ahorcado getJuegoAhorcado() {
        return juegoAhorcado;
    }

    /**
     * @param juegoAhorcado the juegoAhorcado to set
     */
    public void setJuegoAhorcado(Ahorcado juegoAhorcado) {
        this.juegoAhorcado = juegoAhorcado;
    }

    public void controlarLetra() {

        boolean esLetraEncontrada = getJuegoAhorcado().buscarLetra(getLetraIngresada());
        if (esLetraEncontrada == true) {
            if (getJuegoAhorcado().juegoGanado() == true) {
                FacesContext context = FacesContext.getCurrentInstance();
                setComponenteDeshabilitado(false);
                setPalabraIngresada(new String());
                getJuegoAhorcado().reiniciarJuego();
                context.addMessage(null, new FacesMessage("Usted gano el Juego!"));
            }
        } else {

            if (getJuegoAhorcado().getIntentos() <= 0) {
                FacesContext context = FacesContext.getCurrentInstance();
                setComponenteDeshabilitado(false);
                setPalabraIngresada(new String());
                getJuegoAhorcado().reiniciarJuego();

                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "GAME OVER", "Usted perdio el Juego!"));
            }
        }
    }

    public void empezarJuego() {
        getJuegoAhorcado().empezarJuego(getPalabraIngresada());
        setComponenteDeshabilitado(true);
        for (int i = 0; palabraIngresada.length() < 10; i++) {
            juegoAhorcado.getPalabraAhorcado() [i]= '_';
            
        }
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "JUEGO INICIADO", "Que tengas suerte!"));
    }
    

}
