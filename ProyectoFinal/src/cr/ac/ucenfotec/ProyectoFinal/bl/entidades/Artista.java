package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

import java.util.Date;

/**
 * @author Yensy Salazar Jiménez
 * Clase Artista que contiene los atributos asociados a un artista particular.
 * Atributos: idArtista, alias, paisNacimiento, fechaNacimiento, fechaDefunción, edad, genero (agregación - nombre genero muscial), refencias.
 */

public class Artista extends Persona {

    private String alias;
    private String paisNacimiento;
    private Date fechaNacimiento;
    private Date fechaDefuncion;
    private int edad;
    private Genero genero;
    private String referencias;

    /**
     * Métodos de acceso get y set de los atributos de la clase Artista
     */

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
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

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    /**
     * Constructor vacío de la Clase Artista
     */

    public Artista(){

    }

    /**
     * Constructor con parámetros de la Clase Artista
     * @param nombre Nombre del artista (nombre del documento de identificación)
     * @param apellido1 Apellido 1 del artista (apellido 1 del documento de identificación)
     * @param apellido2 Apellido 2 del artista (apellido 1 del documento de identificación)
     * @param alias Nombre ficticio que se crea el artista para el medio musical
     * @param paisNacimiento País donde nació el artista
     * @param fechaNac Fecha en que nació el artista
     * @param fechaDef Fecha en que murió el artista (si es que ha fallecido, sino es null)
     * @param edad Edad actual del artista
     * @param genero Género musical al que se adhiere el artista
     * @param referencias Referencias o descripción adicional del artista o su carrera
     */

    public Artista(String nombre, String apellido1, String apellido2, String alias, String paisNacimiento, Date fechaNac, Date fechaDef, int edad, Genero genero, String referencias) {
        super(nombre, apellido1, apellido2);
        this.alias = alias;
        this.paisNacimiento = paisNacimiento;
        this.fechaNacimiento = fechaNac;
        this.fechaDefuncion = fechaDef;
        this.edad = edad;
        this.genero = genero;
        this.referencias = referencias;

    }

    /**
     * String que imprime los datos de los atributos de la clase Artista
     */

    @Override
    public String toString() {
        return "Artista{" +
                ", alias='" + alias + '\'' +
                ", pais de nacimiento='" + paisNacimiento + '\'' +
                ", fecha de nacimiento=" + getFechaNacimiento() +
                ", fecha de defuncion=" + getFechaDefuncion() +
                ", edad=" + edad +
                ", genero musical=" + genero +
                ", referencias='" + referencias + '\'' +
                "} " + super.toString();
    }


}
