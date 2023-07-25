import Comparators.PeliculaComparators;
import Services.PeliculaService;

public class Main {
    public static void main(String[] args) {

        PeliculaService ps = new PeliculaService();

        ps.crearCartelera();

        ps.mostrarCartelera();
        ps.mostrarMayoresAUnaHora();

        System.out.println("Ordenando por duracion Descendente");
        ps.mostrarCareleraConOrden(PeliculaComparators.ordenarDuracionDesc);

        System.out.println("Ordenando por duracion Ascendente");
        ps.mostrarCareleraConOrden(PeliculaComparators.ordenarDuracionAsc);

        System.out.println("Ordenando por titulo alfabeticamente");
        ps.mostrarCareleraConOrden(PeliculaComparators.ordenaTituloAsc);

        System.out.println("Ordenando por director alfabeticamente");
        ps.mostrarCareleraConOrden(PeliculaComparators.ordenaDirectorAsc);

    }
}
