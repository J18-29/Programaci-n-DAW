import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorPalabras {

    private String contenido;

    // Constructor que lee el archivo
    public ContadorPalabras(String rutaArchivo) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner archivoScanner = new Scanner(new File(rutaArchivo));
            while (archivoScanner.hasNextLine()) {
                sb.append(archivoScanner.nextLine()).append(" ");
            }
            archivoScanner.close();
            contenido = sb.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + rutaArchivo);
            contenido = "";
        }
    }

    // Método para contar cuántas veces aparece una palabra
    public int contarPalabra(String palabra) {
        if (contenido.isEmpty()) {
            return 0;
        }

        String[] palabras = contenido.split("\\s+"); // separa por uno o más espacios
        int contador = 0;
        for (String p : palabras) {
            if (p.equalsIgnoreCase(palabra)) { // ignora mayúsculas/minúsculas
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        ContadorPalabras contador = new ContadorPalabras("texto.txt");

        System.out.print("Introduce la palabra a buscar: ");
        String palabra = sc.nextLine();

        int veces = contador.contarPalabra(palabra);
        System.out.println("La palabra \"" + palabra + "\" aparece " + veces + " veces en el archivo.");

        sc.close();
    }
}
