package Services;

import Entities.Perro;
import Utilities.Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {

    private Scanner input;
    private ArrayList<Perro> perrosList;

    public PerroService() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.perrosList = new ArrayList();
    }

    public ArrayList<Perro> guardarPerro() {
        char opcion;
        do {

            System.out.println("Ingrese el nombre del perro");
            String nombre = input.next();

            System.out.println("Ingrese la raza de " + nombre);
            String raza = input.next();

            perrosList.add( new Perro(nombre, raza));

            System.out.println("Desea agregar otro perro? S/N");
            opcion = input.next().toUpperCase().charAt(0);

        } while(opcion == 'S');

        return perrosList;
    }

    public void mostrarLista() {
        System.out.println("---------LISTANDO---------");
        for(Perro perro: perrosList) {
            System.out.println(perro);
        }
    }

    public void eliminarPerro(Perro p) {
        Iterator<Perro> it = perrosList.iterator();
        boolean found = false;

        while (it.hasNext()) {
            Perro perro = it.next();

            if(perro.getNombre().equalsIgnoreCase(p.getNombre())){
                it.remove();
                found = true;
                break;
            }
        }

        if(!found) System.out.println("El perro no ha sido encontrado");

        Collections.sort(perrosList, Comparators.ordenarPorNombreDesc);

        mostrarLista();
    }

    public ArrayList<Perro> getPerrosList() {
        return perrosList;
    }
}
