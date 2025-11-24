package BuscaLibro;
import java.util.ArrayList;

public class Usuario {
     String nombre;
     int codigo;
     ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        librosPrestados = new ArrayList<>();
    }

    public void prestarLibro(Libro libro) {
        if (libro.prestar()) {
            librosPrestados.add(libro);
            System.out.println(nombre + " ha prestado: " + libro.getNombre());
        } else {
            System.out.println("No hay ejemplares disponibles de: " + libro.getNombre());
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
            System.out.println(nombre + " ha devuelto: " + libro.getNombre());
        } else {
            System.out.println("ERROR: Ese libro no lo tiene prestado el usuario.");
        }
    }
}
