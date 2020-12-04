package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

/**
 * @author Yensy Salazar Jiménez
 * Clase Persona que contiene los atributos asociados a una persona en general.
 * Atributos: nombre, apellido1, apellido2.
 */

public class Persona {

    private String nombre;
    private String apellido1;
    private String apellido2;

    /**
     * Métodos de acceso get y set de los atributos de la clase Persona
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * Constructor vacío de la Clase Persona
     */

    public Persona() {
    }

    /**
     * Constructor con parámetros de la Clase Persona
     * @param nombre Nombre de la persona (nombre del documento de identificación)
     * @param apellido1 Apellido 1 de la persona (apellido 1 del documento de identificación)
     * @param apellido2 Apellido 2 de la persona (apellido 1 del documento de identificación)
     */

    public Persona(String nombre, String apellido1, String apellido2) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    /**
     * String que imprime los datos de los atributos de la clase Persona
     */

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                '}';
    }
}
