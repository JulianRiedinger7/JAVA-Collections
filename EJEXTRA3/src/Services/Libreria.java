package Services;

import java.util.Scanner;
import java.util.TreeSet;

import Entities.Libro;

public class Libreria {
    private final Scanner input = new Scanner(System.in);
    private TreeSet<Libro> listaLibros = new TreeSet<>();

    public void guardarLibros() {
        char opcion;
        do {
            Libro libro = new Libro();

            System.out.println("Ingrese el titulo del libro");
            libro.setTitulo(input.nextLine());

            System.out.println("Ingrese el autor del libro");
            libro.setAutor(input.nextLine());

            System.out.println("Ingrese la cantidad de ejemplares del libro");
            libro.setNumEjemplares(input.nextInt());

            System.out.println("Ingrese la cantidad de ejemplares prestados");
            libro.setNumEjemplaresPrestados(input.nextInt());

            listaLibros.add(libro);

            System.out.println("Desea guardar otro libro? S/N");
            opcion = input.next().toUpperCase().charAt(0);

            input.nextLine();
        } while (opcion == 'S');
    }

    public void mostrarLibros() {
        System.out.println("------LISTA LIBROS------");
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }

        System.out.println("-----------");
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }

        System.out.println(titulo + " no fue encontrado en la lista de libros");
        return null;
    }

    public boolean prestamo() {

        System.out.println("Ingrese el titulo del libro que desea");
        String titulo = input.nextLine();
        Libro libroBuscado = buscarPorTitulo(titulo);

        if (libroBuscado != null) {
            if (libroBuscado.getTitulo().equalsIgnoreCase(titulo)) {
                if (libroBuscado.getNumEjemplares() > 0) {
                    libroBuscado.setNumEjemplares(libroBuscado.getNumEjemplares() - 1);
                    libroBuscado.setNumEjemplaresPrestados(libroBuscado.getNumEjemplaresPrestados() + 1);
                    System.out.println(titulo + " Prestado!");
                    return true;
                } else {
                    System.out.println("No quedan mas ejemplares de " + titulo);
                    return false;
                }
            }
        }
        return false;
    }

    public boolean devolucion() {
        System.out.println("Ingrese el titulo del libro que va a devolver");
        String titulo = input.nextLine();
        Libro libroBuscado = buscarPorTitulo(titulo);

        if (libroBuscado != null) {
            if (libroBuscado.getTitulo().equalsIgnoreCase(titulo)) {
                if (libroBuscado.getNumEjemplaresPrestados() > 0) {
                    libroBuscado.setNumEjemplaresPrestados(libroBuscado.getNumEjemplaresPrestados() - 1);
                    libroBuscado.setNumEjemplares(libroBuscado.getNumEjemplares() + 1);
                    System.out.println("Gracias por devolver " + titulo);
                    return true;
                } else {
                    System.out.println(titulo + " no ha sido prestado");
                    return false;
                }
            }
        }

        return false;
    }
}
