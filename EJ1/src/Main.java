import Entities.Perro;
import Services.PerroService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        PerroService ps = new PerroService();

        ps.guardarPerro();

        ps.mostrarLista();

        Perro p = new Perro("nala", "calle");

        ps.eliminarPerro(p);

    }

}
