package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

/**
 * @author Yensy Salazar Jiménez
 * Clase Administrador que contiene los atributos para crear un Usuario Administrador del sistema.
 * Atributos: nombreUsuario, contrasenna, foto, correoElectronico.
 */

public class Administrador extends Persona {

    private String nombreUsuario;
    private String contrasenna;
    private String foto;
    private String correoElectronico;

    /**
     * Métodos de acceso get y set de los atributos de la clase Administrador
     */

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Constructor vacío de la clase Administrador
     */

    public Administrador() {
    }

    /**
     * Constructor con parámetros de la clase Administrador
     * @param nombre Nombre del usuario administrador
     * @param apellido1 Apellido 1 del usuario administrador
     * @param apellido2 Apellido 2 del usuario administrador
     * @param nombreUsuario Nombre insertado por el Administrador para acceder a la aplicación
     * @param contrasenna Contraseña del usuario administrador para acceder a la aplicación
     * @param foto Fotografía del usuario administrador
     * @param correoElectronico correo electrónico de este usuario
     */

    public Administrador(String nombre, String apellido1, String apellido2, String nombreUsuario, String contrasenna, String foto, String correoElectronico) {
        super(nombre, apellido1, apellido2);
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
        this.foto = foto;
        this.correoElectronico = correoElectronico;
    }

    /**
     * String que imprime los datos de los atributos de la clase Administrador
     */

    @Override
    public String toString() {
        return "Administrador{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasenna='" + contrasenna + '\'' +
                ", foto='" + foto + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                "} " + super.toString();
    }
}
