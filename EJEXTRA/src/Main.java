import Services.ProductoService;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        
        ProductoService ps = new ProductoService();
        int opcion;

        do {
            System.out.println("TIENDA: Ingrese una opcion \n 1.Crear Productos \n " +
                    "2.Mostrar Productos \n 3.Comprar Producto \n" +
                    " 4.Actualizar Inventario \n 5.Eliminar Producto \n 6.Salir");

            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    ps.agregarProductos();
                    break;
                case 2:
                    ps.mostrarProductos();
                    break;
                case 3:
                    ps.venta();
                    break;
                case 4:
                    ps.reposicion();
                    break;
                case 5:
                    ps.eliminarProducto();
                    break;
                default:
                    System.out.println("Gracias por utilizar el sistema!");
                    break;
            }
        } while (opcion < 6 && opcion >= 1);
    }
}
