package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

import java.util.ArrayList;

/**
 * @author Yensy Salazar Jiménez
 * Clase Reproduccion que contiene los atributos asociados a una lista de reproducción.
 * Atributos: idCola, ArrayList<Cancion>.
 */

public class Reproduccion {

    private ArrayList<Cancion>canciones;

    /**
     * Métodos de acceso get y set de los atributos de la clase Reproduccion.
     */

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * Constructor vacío de la Clase Reproduccion
     */

    public Reproduccion() {
    }

    /**
     * Constructor con parámetros de la Clase Reproduccion
     * @param canciones Lista de canciones que componen la Cola de Reproducción
     */

    public Reproduccion(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * String que imprime los datos de los atributos de la clase Reproduccion
     */

    @Override
    public String toString() {
        return "Reproduccion{" +
                ", canciones=" + canciones +
                '}';
    }
}
