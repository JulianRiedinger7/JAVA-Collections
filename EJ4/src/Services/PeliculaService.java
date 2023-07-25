package Services;

import Entities.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {

    private Scanner input;
    private ArrayList<Pelicula> cartelera;

    public PeliculaService() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.cartelera = new ArrayList();
    }

    public void crearCartelera() {
        char opcion;

        do {
            Pelicula p = new Pelicula();

            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitulo(input.next());

            System.out.println("Ingrese el director de " + p.getTitulo());
            p.setDirector(input.next());

            System.out.println("Ingrese la duracion de " + p.getTitulo());
            p.setDuracion(input.nextDouble());

            cartelera.add(p);

            System.out.println("Desea ingresar otra pelicula a la cartelera? S/N");
            opcion = input.next().toUpperCase().charAt(0);
        } while (opcion == 'S');
    }


    public void mostrarCartelera() {
        System.out.println("-----CARTELERA-----");
        for(Pelicula peli: cartelera) {
            System.out.println(peli);
        }

        System.out.println("------------------");
    }

    public void mostrarMayoresAUnaHora() {
        System.out.println("-----Mayores a 1 hora-----");
        for(Pelicula peli: cartelera) {
            if(peli.getDuracion() > 1) {
                System.out.println(peli);
            }
        }

        System.out.println("------------------");
    }

    public void mostrarCareleraConOrden(Comparator<Pelicula> comparator) {
        Collections.sort(cartelera, comparator);

        System.out.println("-----CARTELERA-----");
        for(Pelicula peli: cartelera) {
            System.out.println(peli);
        }

        System.out.println("------------------");
    }

}
