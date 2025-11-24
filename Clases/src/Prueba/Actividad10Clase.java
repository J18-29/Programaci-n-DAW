package Prueba;

import BuscaLibro.Autor;
import BuscaLibro.Biblioteca;
import BuscaLibro.Libro;
import BuscaLibro.Usuario;

public class Actividad10Clase {
    public static void main(String[] args) {
        // Crear autores
        Autor a1 = new Autor("Gabriel García Márquez");
        Autor a2 = new Autor("J. K. Rowling");

        a1.agregarPremio("Nobel de Literatura");

        // Crear libros
        Libro l1 = new Libro("Cien años de soledad", a1, "Realismo Mágico", 1);
        Libro l2 = new Libro("Harry Potter y la Piedra Filosofal", a2, "Fantasía", 3);
        Libro l3 = new Libro("Harry Potter y la Cámara Secreta", a2, "Fantasía", 2);

        // Crear biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Central");
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarLibro(l3);

        // Crear usuario
        Usuario u1 = new Usuario("Carlos", 101);

        System.out.println("=== PRÉSTAMOS ===");
        u1.prestarLibro(l1);
        u1.prestarLibro(l1); // No debería dejar prestarlo otra vez

        System.out.println("\n=== BÚSQUEDA POR AUTOR ===");
        for (Libro l : biblio.buscarPorAutor("J. K. Rowling")) {
            System.out.println(l);
        }

        System.out.println("\n=== BÚSQUEDA POR CATEGORÍA ===");
        for (Libro l : biblio.buscarPorCategoria("Fantasía")) {
            System.out.println(l);
        }

        System.out.println("\n=== DEVOLUCIÓN ===");
        u1.devolverLibro(l1);
        u1.devolverLibro(l1); // Intento de devolver otra vez
    }
}
