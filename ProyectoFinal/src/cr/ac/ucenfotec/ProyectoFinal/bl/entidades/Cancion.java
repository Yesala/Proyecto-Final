package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

/**
 * @author Yensy Salazar Jiménez
 * Clase Cancion que agrega y contiene todas las canciones ingresadas a la Aplicación
 * Atributos: idCancion, nombreCancion, nombreArtista, nombreCompositor, nombreGenero
 */

public class Cancion {

    private String nombreCancion;
    private Artista artista;

    /**
     * Métodos de acceso get y set de los atributos de la clase Cancion
     */

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     * Constructor vacío de la clase Cancion
     */

    public Cancion() {
    }

    /**
     * Constructor con parámetros de la Clase Cancion
     * @param nombreCancion Nombre de la canción a ingresar en la aplicación
     * @param artista Nombre del artista que interpreta la canción
     */

    public Cancion(String nombreCancion, Artista artista) {
        this.nombreCancion = nombreCancion;
        this.artista = artista;
    }


    /**
     * String que imprime los datos de los atributos de la clase Canción
     */


    @Override
    public String toString() {
        return "Cancion{" +
                ", nombreCancion='" + nombreCancion + '\'' +
                ", artista=" + artista +
                '}';
    }
}
