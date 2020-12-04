package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

/**
 * @author Yensy Salazar Jiménez
 * Clase Compositor que contiene los atributos asociados a un compositor.
 * Atributos: idCompositor, paisNacimiento, edad, genero (agregación - nombre genero muscial).
 */

public class Compositor extends Persona {

    private String paisNacimiento;
    private int edad;
    private Genero genero;

    /**
     * Métodos de acceso get y set de los atributos de la clase Compositor
     */

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Constructor vacío de la Clase Compositor
     */

    public Compositor(){
    }

    /**
     * Constructor con parámetros de la Clase Artista
     * @param nombre Nombre del compositor (nombre del documento de identificación)
     * @param apellido1 Apellido 1 del compositor (apellido 1 del documento de identificación)
     * @param apellido2 Apellido 2 del compositor (apellido 1 del documento de identificación)
     * @param paisNacimiento País donde nació el compositor
     * @param edad Edad actual del compositor
     * @param genero Género al que se adhiere el compositor
     */

    public Compositor(String nombre, String apellido1, String apellido2, String paisNacimiento, int edad, Genero genero) {
        super(nombre, apellido1, apellido2);
        this.paisNacimiento = paisNacimiento;
        this.edad = edad;
        this.genero = genero;
    }

    /**
     * String que imprime los datos de los atributos de la clase Compositor
     */

    @Override
    public String toString() {
        return "Compositor{" +
                ", pais de nacimiento='" + paisNacimiento + '\'' +
                ", edad=" + edad +
                ", genero musical=" + genero +
                "} " + super.toString();
    }
}
