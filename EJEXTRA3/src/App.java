import java.util.Scanner;

import Services.Libreria;

public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        menu();
    }


    public static void menu() {
        
        Libreria lib = new Libreria();
        int opcion;

        do {
            System.out.println("LIBRERIA: Ingrese una opcion \n 1.Guardar Libros \n " +
                    "2.Mostrar Libros \n 3.Prestamo \n" +
                    " 4.Devolucion \n 5.Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    lib.guardarLibros();
                    break;
                case 2:
                    lib.mostrarLibros();
                    break;
                case 3:
                    lib.prestamo();
                    break;
                case 4:
                    lib.devolucion();
                    break;
                default:
                    System.out.println("Gracias por utilizar el sistema!");
                    break;
            }
        } while (opcion != 5);
    }

    
}
