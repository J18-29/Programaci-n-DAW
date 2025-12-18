import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumaYMedia {
    public static void main(String[] args) {
        // Ruta del fichero
        File archivo = new File("numeros.txt");

        int suma = 0;
        int contador = 0;

        try {
            Scanner scanner = new Scanner(archivo);

            // Leer mientras haya un entero
            while (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                suma += numero;
                contador++;
            }

            scanner.close();

            if (contador > 0) {
                double media = (double) suma / contador;
                System.out.println("Suma: " + suma);
                System.out.println("Media: " + media);
            } else {
                System.out.println("El fichero no contiene números.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + archivo.getAbsolutePath());
        }
    }
}
