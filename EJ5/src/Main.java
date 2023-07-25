import Services.PaisService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useDelimiter("\n");
        PaisService ps = new PaisService();

        ps.guardarPaises();

        System.out.println("Ingrese un pais a eliminar");
        String pais = input.next();

        ps.eliminarPais(pais);
    }
}
