import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        Integer numero;
        do {
            System.out.println("Ingrese un numero, si quiere terminar, ingrese -99");
            numero = input.nextInt();

            if (numero != -99) listaNumeros.add(numero);
        } while (numero != -99);
        input.close();

        mostrarLista(listaNumeros);
        System.out.println("La suma de la lista es: " + sumarLista(listaNumeros));
        System.out.println("El promedio de la lista es: " + promedioLista(listaNumeros));

    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        for (Integer numero : lista) {
            System.out.println(numero);
        }
    }

    public static Integer sumarLista(ArrayList<Integer> lista) {
        int contador = 0;
        for (Integer numero : lista) {
            contador += numero;
        }

        return contador;
    }

    public static Double promedioLista(ArrayList<Integer> lista) {
        Double promedio = 0.0;
        for (Integer numero : lista) {
            promedio += numero;
        }

        promedio /= lista.size();

        return promedio ;
    }
}
