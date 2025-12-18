import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumaYMediaComas {
    public static void main(String[] args) {
        File archivo = new File("numeros.txt");  // tu fichero

        int suma = 0;
        int contador = 0;

        try {
            Scanner sc = new Scanner(archivo);
            sc.useDelimiter(",");  // le decimos que separe por comas

            while (sc.hasNextInt()) {
                int numero = sc.nextInt();
                suma += numero;
                contador++;
            }

            sc.close();

            if (contador > 0) {
                double media = (double) suma / contador;
                System.out.println("Suma: " + suma);
                System.out.println("Media: " + media);
            } else {
                System.out.println("No hay números en el fichero.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + archivo.getAbsolutePath());
        }
    }
}
