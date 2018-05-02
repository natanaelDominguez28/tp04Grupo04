/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class Ahorcado implements Serializable{

    private String palabraAdivinar;
    private String ayudaPalabra;
    private int intentos;
    private char[] palabraAhorcado;
    

    
    public Ahorcado() {
          reiniciarJuego();

    }
    
    
   
    /**
     * @return the palabraAdivinar
     */
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    /**
     * @param palabraAdivinar the palabraAdivinar to set
     */
    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    /**
     * @return the ayudaPalabra
     */
    public String getAyudaPalabra() {
        return ayudaPalabra;
    }

    /**
     * @param ayudaPalabra the ayudaPalabra to set
     */
    public void setAyudaPalabra(String ayudaPalabra) {
        this.ayudaPalabra = ayudaPalabra;
    }

    /**
     * @return the intentos
     */
    public int getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    /**
     * @return the palabraAhorcado
     */
    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    /**
     * @param palabraAhorcado the palabraAhorcado to set
     */
    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    
    
     public void reiniciarJuego() {
        palabraAhorcado = new char[10];
        palabraAdivinar = "";
        intentos = 4;
    }
     
        public ArrayList<String> getPalabraAhorcadoFormat() {
        ArrayList<String> caracteresPalabra = new ArrayList<String>();
        for (int i = 0; i < palabraAdivinar.length(); i++) { // 
            caracteresPalabra.add(String.valueOf(palabraAhorcado[i]));
        }
        return caracteresPalabra;
    }

   

    public boolean ingresarLetra(char letra) {
        return false;

    }

    public void empezarJuego(String palabra) {
        palabraAdivinar = palabra;

    }

    
    public boolean buscarLetra(char letra) {
        boolean encontro = false;
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letra) {
                palabraAhorcado[i] = letra;
                encontro = true;
            }
        }
       
        if (encontro == false) {
            this.intentos = this.intentos - 1;
            switch (intentos) {
                
                
                case 3: {
           
                    break;
                }
                case 2: {
            
                    break;
                }
                case 1: {
               
                    break;
                }
                case 0: {
                    break;
                }
                default: {

                }
            }
            return false;
        } else {
            return true;
        }

    }

   
    public boolean juegoGanado() {
        boolean ganador = true;
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) != palabraAhorcado[i]) {
                ganador = false;
            }
        }
        return ganador;
    }
       
       
    
    
    

}

