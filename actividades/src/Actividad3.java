

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int contadorPersona = 0;

        Scanner teclado = new Scanner(System.in);
        int edad;

        System.out.println("Introduce edades (escribe -1 para terminar):");

        while (true) {
            System.out.print("Edad: ");
            edad = teclado.nextInt();

            if (edad == -1) {
                break;
            }

            // Validamos que la edad sea positiva (puedes ajustar esto si permites edad 0)
            if (edad < 0) {
                System.out.println("Edad no válida. Intenta de nuevo.");
                continue;
            }

            contadorPersona++;

            // Actualizamos mínimo y máximo
            if (edad > maximo) {
                maximo = edad;
            }
            if (edad < minimo) {
                minimo = edad;
            }
        }

        // Mostramos resultados
        if (contadorPersona > 0) {
            System.out.println("\nNúmero total de personas: " + contadorPersona);
            System.out.println("Edad máxima: " + maximo);
            System.out.println("Edad mínima: " + minimo);
        } else {
            System.out.println("No se introdujo ninguna edad válida.");
        }

        teclado.close();
    }
}


