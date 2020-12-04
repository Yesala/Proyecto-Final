package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

import java.util.ArrayList;

/**
 * @author Yensy Salazar Jiménez
 * Clase Biblioteca que contiene atributos tipo ArrayList para mostrar listas completas de ellos en la aplicación
 * Atributos: ArrayList<Cancion>, ArrayList<Artista>,ArrayList<Album>.
 */

public class Biblioteca {

    private ArrayList<Cancion>canciones;
    private ArrayList<Artista>artistas;
    private ArrayList<Album>albums;

    /**
     * Métodos de acceso get y set de los atributos de la clase Biblioteca
     */

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    /**
     * Constructor vacío de la clase Biblioteca
     */

    public Biblioteca() {
    }

    /**
     * Constructor con parámetros de la Clase Biblioteca
     * @param canciones ArrayList que contiene todas las canciones ingresadas a la aplicacion
     * @param artistas ArrayList que contiene todos los artistas ingresados a la aplicacion
     * @param albums ArrayList que contiene todos los albums ingresados a la aplicacion
     */

    public Biblioteca(ArrayList<Cancion> canciones, ArrayList<Artista> artistas, ArrayList<Album> albums) {
        this.canciones = canciones;
        this.artistas = artistas;
        this.albums = albums;
    }

    /**
     * String que imprime los datos de los atributos de la clase Biblioteca
     */

    @Override
    public String toString() {
        return "Biblioteca{" +
                "Canciones=" + canciones +
                ", Artistas=" + artistas +
                ", Albums=" + albums +
                '}';
    }
}
