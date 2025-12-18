import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EstadisticasRaya {
    public static void main(String[] args) {
        int jugador1 = 0;
        int jugador2 = 0;
        File archivo = new File("estadisticas.txt");

        // Leer estadísticas actuales
        try {
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split("=");
                if (partes[0].equals("jugador1")) jugador1 = Integer.parseInt(partes[1].trim());
                if (partes[0].equals("jugador2")) jugador2 = Integer.parseInt(partes[1].trim());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero, se crearán nuevas estadísticas.");
        }

        // Supongamos que jugador1 gana la partida
        jugador1++;

        // Guardar estadísticas actualizadas
        try {
            FileWriter escritor = new FileWriter("estadisticas.txt");
            escritor.write("jugador1=" + jugador1 + "\n");
            escritor.write("jugador2=" + jugador2 + "\n");
            escritor.close();
            System.out.println("Estadísticas actualizadas correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar estadísticas.");
        }
    }
}
