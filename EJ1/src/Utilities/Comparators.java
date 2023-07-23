package Utilities;

import Entities.Perro;

import java.util.Comparator;

public class Comparators {

    public static Comparator<Perro> ordenarPorNombreAsc = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

    public static Comparator<Perro> ordenarPorNombreDesc = new Comparator<Perro>() {
        @Override
        public int compare(Perro o1, Perro o2) {
            return o2.getNombre().compareTo(o1.getNombre());
        }
    };

}
