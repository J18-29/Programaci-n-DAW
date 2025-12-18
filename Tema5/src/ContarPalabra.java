import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Actividad 1 y 2
public class ContarPalabra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la ruta del fichero: ");
        String ruta = sc.nextLine();
        File fichero = new File(ruta);

        if (!fichero.exists()) {
            System.out.println("El fichero no existe.");
            sc.close();
            return;
        }

        // ---------- ACTIVIDAD 1 ----------
        System.out.print("Introduce la palabra a buscar: ");
        String palabraBuscada = sc.nextLine().toLowerCase();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.toLowerCase().split("\\s+");
                for (String palabra : palabras) {
                    if (palabra.equals(palabraBuscada)) {
                        contador++;
                    }
                }
            }

            System.out.println("La palabra aparece " + contador + " veces en el fichero.");

        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }

        // ---------- ACTIVIDAD 2 ----------
        try {
            String nombre = fichero.getName();
            String nombreSinExtension = nombre.substring(0, nombre.lastIndexOf('.'));
            String extension = nombre.substring(nombre.lastIndexOf('.') + 1);

            LocalDate fecha = LocalDate.now();

            String nombreCopia = nombreSinExtension + "_copia_" +
                    fecha.getYear() + "_" +
                    fecha.getMonthValue() + "_" +
                    fecha.getDayOfMonth() + "." + extension;

            File ficheroCopia = new File(fichero.getParent(), nombreCopia);

            Files.copy(fichero.toPath(), ficheroCopia.toPath(), StandardCopyOption.REPLACE_EXISTING);

            System.out.println("Copia creada correctamente: " + ficheroCopia.getName());

        } catch (IOException e) {
            System.out.println("Error al crear la copia del fichero.");
        }

        sc.close();
    }

    static void insertar() {
        Scanner sc = new Scanner(System.in);

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\Usuario\\Documents\\GitHub\\Java2024\\Tema5\\src\\ContarPalabra.java"));
            String cabecera = br.readLine();
            String[] columnas = cabecera.split(";");
            br.close();

            StringBuilder nuevo = new StringBuilder();
            for (String columna : columnas) {
                System.out.print("Introduce " + columna + ": ");
                nuevo.append(sc.nextLine()).append(";");
            }
            nuevo.deleteCharAt(nuevo.length() - 1);

            BufferedWriter bw = new BufferedWriter(new FileWriter("datos.csv", true));
            bw.newLine();
            bw.write(nuevo.toString());
            bw.close();

        } catch (Exception e) {
            System.out.println("Error al insertar los datos");
        }

        sc.close();
    }

    static void modificar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID del alumno: ");
        String idBuscar = sc.nextLine();

        ArrayList<String> lineas = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.csv"));
            String cabecera = br.readLine();
            lineas.add(cabecera);

            String[] columnas = cabecera.split(";");
            int indiceNombre = Arrays.asList(columnas).indexOf("Nombre");

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos[0].equals(idBuscar)) {
                    System.out.print("Nombre del alumno: ");
                    datos[indiceNombre] = sc.nextLine();
                }
                lineas.add(String.join(";", datos));
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Error al modificar los datos");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos.csv"))) {
            for (String lineaActual : lineas) {
                bw.write(lineaActual);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error al guardar los datos");
        }

        sc.close();
    }
}
