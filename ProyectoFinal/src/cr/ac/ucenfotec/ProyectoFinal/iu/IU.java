package cr.ac.ucenfotec.ProyectoFinal.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    /*Menu de usuario final*/
    public void mostrarMenu() {
        output.println("Bievenido a la Applicacion SING");
        /*output.println("Ingresar usuario y contraseña");*/
        output.println("Seleccione una opción:");
        output.println("1. Crear Administrador");
        output.println("2. Crear Usuario");
        output.println("3. Agregar canción");
        output.println("4. Crear Playlist");
        output.println("5. Crear Album");
        output.println("6. Crear Cola Reproducción");
        output.println("7. Agregar artista");
        output.println("8. Agregar compositor");
        output.println("9. Agregar género");
        output.println("10. Realizar búsqueda de una canción");
        output.println("11. Ver Biblioteca");
        output.println("12. Salir");
    }

    public int leerOpcion() {
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public  void imprimir(String msg){
        output.println(msg);
    }

    public String leerString(){
        return input.next();
    }

    public int leerEntero(){
        return input.nextInt();
    }
}