import java.text.Normalizer;
import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La frase es palíndroma");
        } else {
            System.out.println("La frase no es palíndroma");
        }
    }

    public static boolean esPalindromo(String texto) {
        // Quitar tildes y normalizar
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[\\p{M}]", "");
        // Quitar espacios y poner todo en minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Comparar con la inversa
        String inversa = new StringBuilder(texto).reverse().toString();
        return texto.equals(inversa);
    }
}
