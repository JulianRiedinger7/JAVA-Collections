package Entities;

public class Producto {
    private String nombre, categoria;
    private double precio;
    private int inventario;

    public Producto() {}

    public Producto(String nombre, String categoria, double precio, int inventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", inventario=" + inventario +
                '}';
    }
}
