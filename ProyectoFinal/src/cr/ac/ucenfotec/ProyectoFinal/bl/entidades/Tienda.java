package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

/**
 * @author Yensy Salazar Jiménez
 * Clase Tienda que contiene las canciones que se van a vender en la aplicacion
 * Atributos: cancionVenta.
 */


public class Tienda {

    private String cancionVenta;

    /**
     * Métodos de acceso get y set de los atributos de la clase Tienda
     */

    public String getCancionVenta() {
        return cancionVenta;
    }

    public void setCancionVenta(String cancionVenta) {
        this.cancionVenta = cancionVenta;
    }

    /**
     * Constructor vacío de la clase Biblioteca
     */

    public Tienda() {
    }

    /**
     * Constructor con parámetros de la Clase Biblioteca
     * @param cancionVenta Nombre de la cancion a la venta en la Tienda.
     */

    public Tienda(String cancionVenta) {
            this.cancionVenta = cancionVenta;
        }

    /**
     * String que imprime los datos de los atributos de la clase Tienda
     */

    @Override
    public String toString() {
        return "Tienda{" +
                "cancionVenta='" + cancionVenta + '\'' +
                '}';
    }
}
