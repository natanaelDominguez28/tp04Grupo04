/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion.controlador.bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto6.aplicacion.modelo.dominio.Auto;

/**
 *
 * @author SONY
 */
@ManagedBean
@ViewScoped
public class AutoFomBean {

    private Auto auto;
    private List<Auto> listaAutos;
    private List<Auto> listaResultado;

    public AutoFomBean() {
        auto = new Auto();
        listaAutos = new ArrayList<Auto>();
        listaResultado = new ArrayList<Auto>();
        //la lista de autos precargada
        listaAutos.add(new Auto("XCB456", "Renault", "2010", "Gris", "Nafta"));
        listaAutos.add(new Auto("MFD786", "Chevrolet", "2011", "Rojo", "Gasoil"));
        listaAutos.add(new Auto("JSF765", "Fiat", "2016", "Negro", "Nafta"));
        listaAutos.add(new Auto("ADS234", "Ford", "2015", "Blanco", "Nafta"));
        listaAutos.add(new Auto("KBF345", "Renault", "2017", "Verde", "Gasoil"));
        listaAutos.add(new Auto("IRG675", "Fiad", "2007", "Rojo", "Nafta"));
    }

    public void asignarAuto(Auto auto) {
        this.setAuto(auto);
    }

    public void guardarCambios() {
        this.setAuto(null);
    }

    /**
     * @return the listaAutos
     */
    public List<Auto> getListaAutos() {
        return listaAutos;
    }

    /**
     * @param listaAutos the listaAutos to set
     */
    public void setListaAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }

    /**
     * @return the auto
     */
    public Auto getAuto() {
        if (auto == null) {
            auto = new Auto();
        }
        return auto;
    }

    /**
     * @param auto the auto to set
     */
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    /**
     * @return the listaResultado
     */
    public List<Auto> getListaResultado() {
        return listaResultado;
    }

    /**
     * @param listaResultado the listaResultado to set
     */
    public void setListaResultado(List<Auto> listaResultado) {
        this.listaResultado = listaResultado;
    }

}
