package Comparators;

import Entities.Pais;

import java.util.Comparator;

public class PaisComparators {

    public static Comparator<Pais> ordenarNombreAsc = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };

    public static Comparator<Pais> ordenarCapitalAsc = new Comparator<Pais>() {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getCapital().compareTo(o2.getCapital());
        }
    };
}
