package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Yensy Salazar Jiménez
 * Clase Album que contiene los atributos para crear un album compuesto de una lista de canciones de un artista.
 * Atributos: idAlbum, nombreAlbum, fechaLanzamiento, imagen, artista (agregacion para obtener nombre), ArrayList<Cancion> (composición -arreglo- canciones).
 */

public class Album {

    private String nombreAlbum;
    private Date fechaLanzamiento;
    private String imagen;
    private Artista artista;
    private ArrayList<Cancion>canciones;

    /**
     * Métodos de acceso get y set de los atributos de la clase Album
     */

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     * Constructor vacío de la Clase Album
     */

    public Album() {
    }

    /**
     * Constructor con parámetros de la Clase Album
     * @param nombreAlbum Nombre del album que se esta creando
     * @param fechaLanzamiento Fecha de Lanzamiento o Creación del album que se esta creando
     * @param imagen Imagen con la que se presentaría el album que se esta creando
     * @param artista Nombre del artista (feat) asociados al album que se esta creando
     * @param canciones Lista de canciones agregadas y que componen el album que se esta creando
     */

    public Album(String nombreAlbum, Date fechaLanzamiento, String imagen, Artista artista, ArrayList<Cancion> canciones) {
        this.nombreAlbum = nombreAlbum;
        this.fechaLanzamiento = fechaLanzamiento;
        this.imagen = imagen;
        this.artista = artista;
        this.canciones = canciones;
    }

    /**
     * String que imprime los datos de los atributos de la clase Album
     */

    @Override
    public String toString() {
        return "Album{" +
                ", nombreAlbum='" + nombreAlbum + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", imagen='" + imagen + '\'' +
                ", artista=" + artista +
                ", canciones=" + canciones +
                '}';
    }
}
