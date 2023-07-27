package Services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import Entities.Producto;

public class ProductoService {
    private Scanner input;
    private HashMap<String, Double> listaProductos;

    public ProductoService() {
        this.input = new Scanner(System.in);
        this.listaProductos = new HashMap<>();
    }

    public void ingresarProducto() {
        char opcion;
        do {
            Producto p = new Producto();

            System.out.println("Ingrese el producto");
            p.setNombre(input.next());
            System.out.println("Ingrese el precio del producto");
            p.setPrecio(input.nextDouble());

            listaProductos.put(p.getNombre(), p.getPrecio());

            System.out.println("Desea ingresar un nuevo producto? S/N");
            opcion = input.next().toUpperCase().charAt(0);

        } while (opcion == 'S');
    }

    public void mostrarListaProductos() {
        System.out.println("------Listando Productos------");
        for (Map.Entry<String, Double> productoEntry : listaProductos.entrySet()) {
            System.out.println("Producto " + productoEntry.getKey() + ": $" + productoEntry.getValue());
        }
        System.out.println("------------");
    }

    public void modificarPrecioProducto() {
        System.out.println("Ingrese el producto del que quiere modificar su precio");
        String nombre = input.next();
        boolean encontrado = false;

        for (Map.Entry<String, Double> productoEntry : listaProductos.entrySet()) {
            if (productoEntry.getKey().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el nuevo precio para " + productoEntry.getKey());
                double precio = input.nextDouble();

                productoEntry.setValue(precio);
                System.out.println("Precio actualizado correctamente");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) System.out.println(nombre + " no fue encontrado en la lista de productos");

    }


    public void eliminarProducto() {
        System.out.println("Ingrese el producto que desea eliminar de la lista");
        String nombre = input.next();
        boolean encontrado = false;

        Iterator<Map.Entry<String, Double>> it = listaProductos.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();

            if(entry.getKey().equalsIgnoreCase(nombre)) {
                it.remove();
                encontrado = true;
                System.out.println(nombre + " eliminado correctamente de la lista");
                break;
            }
        }

        if(!encontrado) System.out.println(nombre + " no fue encontrado en la lista de productos");
    }

}
