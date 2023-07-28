package Entities;
import java.util.Objects;

public class Libro implements Comparable<Libro> {
    private String titulo, autor;
    private Integer numEjemplares, numEjemplaresPrestados;

    public Libro(){}


    public Libro(String titulo, String autor, Integer numEjemplares, Integer numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumEjemplares() {
        return this.numEjemplares;
    }

    public void setNumEjemplares(Integer numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public Integer getNumEjemplaresPrestados() {
        return this.numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(Integer numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", numEjemplares='" + getNumEjemplares() + "'" +
            ", numEjemplaresPrestados='" + getNumEjemplaresPrestados() + "'" +
            "}";
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(numEjemplares, libro.numEjemplares) && Objects.equals(numEjemplaresPrestados, libro.numEjemplaresPrestados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, numEjemplares, numEjemplaresPrestados);
    }


    @Override
    public int compareTo(Libro o) {
        return this.titulo.compareTo(o.getTitulo());
    }
    

}
