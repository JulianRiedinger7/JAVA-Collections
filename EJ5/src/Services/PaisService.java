package Services;

import Comparators.PaisComparators;
import Entities.Pais;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisService {
    private Scanner input;
    private TreeSet<Pais> listaPaises;

    public PaisService() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.listaPaises = new TreeSet(PaisComparators.ordenarNombreAsc);
    }

    public void guardarPaises() {
        char opcion;

        do {
            Pais p = new Pais();
            System.out.println("Ingrese un pais");
            p.setNombre(input.next());

            System.out.println("Ingrese la capital de " + p.getNombre());
            p.setCapital(input.next());

            listaPaises.add(p);

            System.out.println("Desea ingresar un nuevo pais? S/N");
            opcion = input.next().toUpperCase().charAt(0);
        } while (opcion == 'S');

        mostrarPaises();
    }

    public void mostrarPaises() {
        for(Pais pais: listaPaises) {
            System.out.println(pais);
        }
    }

    public void eliminarPais(String pais) {
        Iterator<Pais> it = listaPaises.iterator();
        boolean encontrado = false;

        while(it.hasNext()) {
            Pais paisActual = it.next();

            if(paisActual.getNombre().equalsIgnoreCase(pais)) {
                it.remove();
                encontrado = true;
                System.out.println("Pais eliminado de la lista de paises");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El pais no fue encontrado en la lista de paises");
        } else {
            mostrarPaises();
        }
    }
}
