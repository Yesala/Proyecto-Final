package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Yensy Salazar Jiménez
 * Clase Lista que contiene los atributos asociados a una lista de canciones.
 * Atributos: idLista, nombreLista, fechaCreacion, calificación, ArrayList<Cancion>.
 */

public class Lista {

    private String nombreLista;
    private Date fechaCreacion;
    private int calificacion;
    private ArrayList<Cancion>canciones;

    /**
     * Métodos de acceso get y set de los atributos de la clase Lista
     */


    public String getNombreLista() {
        return nombreLista;
    }

    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * Constructor vacío de la Clase Lista
     */

    public Lista() {
    }

    /**
     * Constructor con parámetros de la Clase Lista
     * @param nombreLista Nombre de la lista que se esta creando
     * @param fechaCreacion Fecha de creación de la lista
     * @param calificacion Calificación de la canción que se esta agregando
     * @param canciones Lista de canciones que componen la lista creada
     */

    public Lista(String nombreLista, Date fechaCreacion, int calificacion, ArrayList<Cancion> canciones) {
        this.nombreLista = nombreLista;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
        this.canciones = canciones;
    }

    /**
     * String que imprime los datos de los atributos de la clase Lista
     */
    @Override
    public String toString() {
        return "Lista{" +
                ", nombreLista='" + nombreLista + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", calificacion=" + calificacion +
                ", canciones=" + canciones +
                '}';
    }
}
