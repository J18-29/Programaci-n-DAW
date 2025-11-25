package Examen;

import java.text.Normalizer;
import java.util.Scanner;

public class Examen4 { 
    public static void main(String[] args) {

        // Crear un Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");

        // Leer la línea completa introducida por el usuario
        String frase = sc.nextLine();

        // Comprobar si la frase es un Anagrama
        if (verificaAnagrama(frase)) {
            System.out.println("La frase es Anagrama");
        } else {
            System.out.println("La frase no es Anagrama");
        }
    }

    // Método que devuelve true si el texto es Angrama, false si no
    public static boolean verificaAnagrama(String texto) {

        
        // [\\p{M}] elimina los marcadores de acento
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[\\p{M}]", "");

        // Quitar todos los espacios y convertir a minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Crear la cadena inversa
        String inversa = new StringBuilder(texto).reverse().toString();

        // Comprobar si la cadena original (procesada) es igual a la inversa
        return texto.equals(inversa);
    }
}
