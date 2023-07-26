package Services;

import Entities.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoService {

    private Scanner input;
    private ArrayList<Producto> listaProductos;

    public ProductoService() {
        this.input = new Scanner(System.in).useDelimiter("\n");
        this.listaProductos = new ArrayList();
    }


    public void agregarProductos() {
        char opcion;
        do {
            Producto p = new Producto();

            System.out.println("Ingrese el nombre del producto");
            p.setNombre(input.next());

            System.out.println("Ingrese la categoria del producto");
            p.setCategoria(input.next());

            System.out.println("Ingrese el precio de " + p.getNombre());
            p.setPrecio(input.nextDouble());

            System.out.println("Ingrese el inventario del producto");
            p.setInventario(input.nextInt());

            listaProductos.add(p);

            System.out.println("Desea ingresar un nuevo producto? S/N");
            opcion = input.next().toUpperCase().charAt(0);

        } while(opcion == 'S');
    }

    public void mostrarProductos() {
        System.out.println("-----Mostrando Productos-----");
        for(Producto producto : listaProductos) {
            System.out.println(producto);
        }
        System.out.println("---------------");

    }

    public Producto productoBuscado(String nombre) {
        for(Producto producto: listaProductos) {
            if(producto.getNombre().equalsIgnoreCase(nombre)) return producto;
        }

        System.out.println(nombre + " no fue encontrado en la lista de productos");
        return null;
    }

    public boolean venta() {
        System.out.println("Ingrese el nombre del producto que desea comprar");
        String nombre = input.next();

        Producto producto = productoBuscado(nombre);

       if(producto != null) {
           if(producto.getInventario() > 0) {
               producto.setInventario(producto.getInventario() - 1);
               System.out.println(producto.getNombre() + " comprado! Ahora tiene un inventario de " + producto.getInventario());
               return true;
           } else {
               System.out.println(producto.getNombre() + " no tiene inventario disponible!");
               return false;
           }
       }

        return false;
    }

    public void reposicion() {
        System.out.println("Ingrese el nombre del producto a reponer");
        String nombre = input.next();

        Producto producto = productoBuscado(nombre);

        if(producto != null ){
            producto.setInventario(producto.getInventario() + 1);
            System.out.println(producto.getNombre() + " repuesto! Ahora tiene un inventario de " + producto.getInventario());
        }

    }

    public void eliminarProducto() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        String nombre = input.next();

        Producto producto = productoBuscado(nombre);

        if(producto != null) {
            listaProductos.remove(producto);
        }
    }
}
