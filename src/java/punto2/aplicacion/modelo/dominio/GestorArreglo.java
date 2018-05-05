package punto2.aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author EmanuelL
 */
public class GestorArreglo implements Serializable {

    private List<Integer> numeros = new ArrayList<>();
    private int numeroAgregar;
    private int menor;

    public GestorArreglo() {
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public int getNumero() {
        return numeroAgregar;
    }

    public void setNumero(int numero) {
        this.numeroAgregar = numero;
    }

    public void agregarNumero() {
        numeros.add(numeroAgregar);

    }

    public int obtenerMayor() {
        int mayor = 0;
        for (int i = 0; i < numeros.size(); i++) {
            if (mayor < numeros.get(i)) {
                mayor = numeros.get(i);
            }
        }
        return mayor;
    }

    public int obtenerMenor() {
        if (!numeros.isEmpty()) {
            menor = numeros.get(0);
            for (int i = 0; i < numeros.size(); i++) {
                System.out.println("entro a buscar el menor");
                if (menor > numeros.get(i)) {
                    menor = numeros.get(i);
                }
            }
        }
        return menor;
    }

    public double calcularPromedio() {
        System.out.println("entro promedio");
        double promedio = 0;
        for (int i = 0; i < numeros.size(); i++) {
            promedio = promedio + numeros.get(i);
        }
        promedio = promedio / numeros.size();
        return promedio;
    }

}
