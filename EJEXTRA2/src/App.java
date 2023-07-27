import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Entities.CantanteFamoso;

public class App {
    static final Scanner input = new Scanner(System.in);
    static ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        listaCantantes.add(new CantanteFamoso("Oliver Sykes", "Thats the Spirit"));
        listaCantantes.add(new CantanteFamoso("Duki", "Super Sangre Joven"));
        mostrarCantantes(listaCantantes);
        menu();
    }

    public static void agregarCantante(ArrayList<CantanteFamoso> lista) {
        CantanteFamoso cf = new CantanteFamoso();
        System.out.println("Ingrese el nombre del cantante ");
        cf.setNombre(input.nextLine());

        System.out.println("Ingrese el disco mas vendido de " + cf.getNombre());
        cf.setDiscoConMasVentas(input.nextLine());

        lista.add(cf);
    }

    
    public static void mostrarCantantes(ArrayList<CantanteFamoso> lista) {
        System.out.println("------LISTA CANTANTES------");
        for (CantanteFamoso cantanteFamoso : lista) {
            System.out.println(cantanteFamoso.getNombre() + " - " + " Disco mas vendido: "
                    + cantanteFamoso.getDiscoConMasVentas());
        }

        System.out.println("------------");
    }

    public static void eliminarCantante() {
        System.out.println("Ingrese el nombre del cantante a eliminar");
        String nombre = input.nextLine();
        boolean encontrado = false;

        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        
        while(it.hasNext()) {
            CantanteFamoso cantanteActual = it.next();

            if(cantanteActual.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                encontrado = true;
                System.out.println(nombre + " eliminado correctamente");
                break;
            }
        }

        if(!encontrado) System.out.println("Cantante no encontrado en la lista");
    }

    public static void menu() {
        int opcion;
        do {
            System.out.println(
                    "MENU CANTANTES: 1.Agregar Nuevo Cantante \n 2.Mostrar Cantantes \n 3.Eliminar un Cantante \n 4.Salir");

            opcion = input.nextInt();
            input.nextLine();

            switch (opcion) {
                case 1:
                    agregarCantante(listaCantantes);
                    break;
                case 2:
                    mostrarCantantes(listaCantantes);
                    break;
                case 3:
                    eliminarCantante();
                    break;
                default:
                    System.out.println("Gracias por utilizar el sistema!");
                    break;
            }

        } while (opcion != 4);
    }
}
