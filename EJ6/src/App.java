import java.util.Scanner;

import Services.ProductoService;

public class App {
    public static void main(String[] args) throws Exception {

        menu();

    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        ProductoService ps = new ProductoService();
        int opcion;
        do {

            System.out.println(
                    "TIENDA - Ingrese la opcion \n 1.Ingresar Productos \n 2.Mostrar Lista de Productos \n 3.Modificar Precio \n 4.Eliminar Producto \n 5.Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    ps.ingresarProducto();
                    break;
                case 2:
                    ps.mostrarListaProductos();
                    break;
                case 3:
                    ps.modificarPrecioProducto();
                    break;
                case 4:
                    ps.eliminarProducto();
                    break;
                default:
                    System.out.println("Gracias por utilizar el Sistema!");
                    break;
            }

        } while (opcion != 5);
    }
}
