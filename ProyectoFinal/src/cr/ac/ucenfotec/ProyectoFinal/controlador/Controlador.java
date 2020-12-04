package cr.ac.ucenfotec.ProyectoFinal.controlador;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.*;
import cr.ac.ucenfotec.ProyectoFinal.gestor.Gestor;
import cr.ac.ucenfotec.ProyectoFinal.iu.IU;

import java.util.ArrayList;

public class Controlador {

    private IU iu = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
        int opcion = 0;
        do {
            iu.mostrarMenu();
            opcion = iu.leerOpcion();
            procesarOpcion(opcion);
        } while (opcion != 12);

    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearAdministrador();
                break;
            case 2:
                crearUsuario();
                break;
            case 3:
                crearCancion();
                break;
            case 4:
                crearLista();
                break;
            case 5:
                agruparAlbum();
                break;
            case 6:
                crearListaReproduccion();
                break;
            case 7:
                agregarArtistas();
                break;
            case 8:
                agregarCompositores();
                break;
            case 9:
                agregarGeneros();
            case 10:
                //busqueda();
                break;
            case 11:
                //verBiblioteca();
            case 12:
                break;
            default:
                iu.imprimir("Opcion desconocida");
        }
    }

    //Faltan métodos para Búsqueda, Biblioteca y Tienda.

    private void crearAdministrador() {
        iu.imprimir("Nombre del Usuario Administrador");
        String nombre = iu.leerString();
        iu.imprimir("Primer apellido");
        String apellido1 = iu.leerString();
        iu.imprimir("Segundo apellido");
        String apellido2 = iu.leerString();
        iu.imprimir("Crear nombre de usuario");
        String nombreUsuarioFinal = iu.leerString();
        iu.imprimir("Crear contraseña");
        String contrasenna = iu.leerString();
        iu.imprimir("Adjunte una fotografía");
        String foto = iu.leerString();
        iu.imprimir("Ingrese su correo electrónico");
        String correoElectronico = iu.leerString();
        gestor.crearAdministrador(nombre,apellido1,apellido2,nombreUsuarioFinal,contrasenna,foto,correoElectronico);

    }

    private void crearUsuario() {
        iu.imprimir("Nombre del usuario");
        String nombre = iu.leerString();
        iu.imprimir("Primer apellido");
        String apellido1 = iu.leerString();
        iu.imprimir("Segundo apellido");
        String apellido2 = iu.leerString();
        iu.imprimir("Ingrese su numero de identificacion");
        String identificacion = iu.leerString();
        iu.imprimir("País de procedencia");
        String paisProcedencia = iu.leerString();
        iu.imprimir("Ingrese su edad");
        int edad = iu.leerEntero();
        iu.imprimir("Ingrese su correo electrónico");
        String correoElectronico = iu.leerString();
        iu.imprimir("Adjunte una fotografía");
        String foto = iu.leerString();
        iu.imprimir("Crear nombre de usuario");
        String nombreUsuarioFinal = iu.leerString();
        iu.imprimir("Crear contraseña");
        String contrasenna = iu.leerString();
        gestor.crearUsuario(nombre,apellido1,apellido2,identificacion,paisProcedencia,edad,correoElectronico,foto,nombreUsuarioFinal,contrasenna);
    }

    private void crearCancion() {
        iu.imprimir("Nombre de la canción");
        String nombreCancion = iu.leerString();
        iu.imprimir("Nombre artístico");
        String alias = iu.leerString();
        //faltan atributos String mp3 e imagen
        gestor.crearCancion(nombreCancion,alias);
    }

    private void crearLista(){
        iu.imprimir("Ingrese el nombre de la lista: ");
        String nombreLista = iu.leerString();
        iu.imprimir("Fecha de creacion");
        String fechaLista = iu.leerString();
        iu.imprimir("Digite el nombre de la cancion:");
        ArrayList<String> nombreCanciones = new ArrayList<>();
        int validacion = 0;
        while (validacion == 0){
            String nombreCancion = iu.leerString();
            nombreCanciones.add(nombreCancion);
            iu.imprimir("Desea agregar otra cancion: Digite 0=si, 1=no");
            validacion = iu.leerEntero();
        }
        iu.imprimir("Agregue una calificacion a la canción: 1.Muy Mala, 2.Mala, 3.Regular, 4.Buena, 5.Muy buena");
        int califacion = iu.leerEntero();
        ArrayList<Cancion>cancionesLista = new ArrayList<>();
        gestor.crearLista(nombreLista,fechaLista,califacion,cancionesLista);
    }

    private void agruparAlbum(){
        iu.imprimir("Ingrese el nombre del Album: ");
        String nombreAlbum = iu.leerString();
        iu.imprimir("Ingrese la fecha de lanzamiento: ");
        String fechaLanzam = iu.leerString();
        iu.imprimir("Agregue una fotografía del album");
        String imagen = iu.leerString();
        iu.imprimir("Digite el nombre de la cancion:");
        ArrayList<String> nombreCanciones = new ArrayList<>();
        int validacion = 0;
        while (validacion == 0){
            String nombreCancion = iu.leerString();
            nombreCanciones.add(nombreCancion);
            iu.imprimir("Desea agregar otra cancion: Digite 0=si, 1=no");
            validacion = iu.leerEntero();
        }
        iu.imprimir("Nombre del artista");
        String artista = iu.leerString();
        ArrayList<Cancion>cancionesAlbum = new ArrayList<>();
        gestor.agregarAlbum(nombreAlbum,fechaLanzam,imagen,artista,cancionesAlbum);
    }

    private void crearListaReproduccion(){
        iu.imprimir("Digite el nombre de la cancion:");
        ArrayList<String> nombreCanciones = new ArrayList<>();
        int validacion = 0;
        while (validacion == 0){
            String nombreCancion = iu.leerString();
            nombreCanciones.add(nombreCancion);
            iu.imprimir("Desea agregar otra cancion: Digite 0=si, 1=no");
            validacion = iu.leerEntero();
        }
        ArrayList<Cancion>canciones = new ArrayList<>();
        gestor.crearListaReproduccion(canciones);
    }

    private void agregarArtistas() {
        iu.imprimir("Nombre del artista");
        String nombre = iu.leerString();
        iu.imprimir("Primer apellido");
        String apellido1 = iu.leerString();
        iu.imprimir("Segundo apellido");
        String apellido2 = iu.leerString();
        iu.imprimir("Alias o nombre Artístico");
        String alias = iu.leerString();
        iu.imprimir("País de nacimiento");
        String paisNacimiento = iu.leerString();
        iu.imprimir("Fecha de nacimiento");
        String fechaNacimiento = iu.leerString();
        iu.imprimir("Fecha de defuncion");
        String fechaDefuncion = iu.leerString();
        iu.imprimir("Edad");
        int edad = iu.leerEntero();
        iu.imprimir("Genero musical");
        String nombreGenero = iu.leerString();
        iu.imprimir("Referencias");
        String referencia = iu.leerString();
        gestor.agregarArtista(nombre,apellido1,apellido2,alias,paisNacimiento,fechaNacimiento, null,edad,nombreGenero,referencia);
    }

    private void agregarCompositores() {
        iu.imprimir("Nombre del artista");
        String nombre = iu.leerString();
        iu.imprimir("Primer apellido");
        String apellido1 = iu.leerString();
        iu.imprimir("Segundo apellido");
        String apellido2 = iu.leerString();
        iu.imprimir("País de nacimiento");
        String paisNacimiento = iu.leerString();
        iu.imprimir("Edad");
        int edad = iu.leerEntero();
        iu.imprimir("Genero(s) musical");
        String nombreGenero = iu.leerString();
        gestor.agregarCompositor(nombre,apellido1,apellido2,paisNacimiento,edad,nombreGenero);
    }

    private void agregarGeneros() {
        iu.imprimir("Nombre del genero musical");
        String nombreGenero = iu.leerString();
        gestor.agregarGenero(nombreGenero);
    }

    /*private void busqueda(){
        iu.imprimir("Ingrese el nombre de la canción");
        String nombreCancion = iu.leerString();
        Lista encontrada = gestor.busqueda(nombreCancion);
        if (encontrada != null) {
            iu.imprimir("La canción si existe");
        } else {
            iu.imprimir("No existe");
        }
    }*/

}