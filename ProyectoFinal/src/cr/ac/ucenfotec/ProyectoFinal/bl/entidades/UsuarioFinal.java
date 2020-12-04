package cr.ac.ucenfotec.ProyectoFinal.bl.entidades;

/**
 * @author Yensy Salazar Jiménez
 * Clase Usuario Final que contiene los atributos para crear un Usuario de la Aplicación.
 * Atributos: idUsuario, identificacion, país de procedencia, edad, correo electrónico, foto, nombre Usuario Final, contraseña.
 */

public class UsuarioFinal extends Persona {

    private String identificacion;
    private String paisProcedencia;
    private int edad;
    private String correoElectronico;
    private String foto;
    private String nombreUsuarioFinal;
    private String contrasenna;

    /**
     * Métodos de acceso get y set de los atributos de la clase UsuarioFinal
     */

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNombreUsuarioFinal() {
        return nombreUsuarioFinal;
    }

    public void setNombreUsuarioFinal(String nombreUsuarioFinal) {
        this.nombreUsuarioFinal = nombreUsuarioFinal;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    /**
     * Constructor vacío de la clase UsuarioFinal
     */

    public UsuarioFinal(){

    }

    /**
     * Constructor con parámetros de la clase UsuarioFinal
     * @param nombre Nombre del usuario administrador
     * @param apellido1 Apellido 1 del usuario administrador
     * @param apellido2 Apellido 2 del usuario administrador
     * @param identificacion Número de identificación -número de cédula de identidad- del usuario
     * @param paisProcedencia País del que procede el usuario
     * @param edad Edad actual del usuario
     * @param correoElectronico correo electrónico de este usuario
     * @param foto Fotografía del usuario administrador
     * @param nombreUsuarioFinal Nombre que ingresar el usuario final para acceder a la aplicación
     * @param contrasenna Contraseña del usuario final para acceder a la aplicación
     */

    public UsuarioFinal(String nombre, String apellido1, String apellido2, String identificacion, String paisProcedencia, int edad, String correoElectronico, String foto, String nombreUsuarioFinal, String contrasenna) {
        super(nombre, apellido1, apellido2);
        this.identificacion = identificacion;
        this.paisProcedencia = paisProcedencia;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.foto = foto;
        this.nombreUsuarioFinal = nombreUsuarioFinal;
        this.contrasenna = contrasenna;
    }

    /**
     * String que imprime los datos de los atributos de la clase UsuarioFinal
     */

    @Override
    public String toString() {
        return "UsuarioFinal{" +
                ", identificacion='" + identificacion + '\'' +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", edad=" + edad +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", foto='" + foto + '\'' +
                ", nombreUsuarioFinal='" + nombreUsuarioFinal + '\'' +
                ", contrasenna='" + contrasenna + '\'' +
                "} " + super.toString();
    }
}
