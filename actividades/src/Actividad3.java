import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        // Desarrolla un programa que muestre la edad máxima y mínima de un grupo de alumnos
        // que se introduzca hasta escribir -1
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int contadorPersona = 0;

        Scanner teclado = new Scanner(System.in);
        int edad;

        do {
            System.out.println("Introduce una edad o -1 para salir: ");
            edad = teclado.nextInt();

            if (edad != -1) {
                contadorPersona++; // Nueva persona

                // Establezco la lógica para máximo y mínimo
                if (edad > maximo) {
                    maximo = edad;
                }
                if (edad < minimo) {
                    minimo = edad;
                }
            }
        } while (edad != -1);

        if (contadorPersona > 0) {
            System.out.println("El número de personas: " + contadorPersona);
            System.out.println("La edad máxima es: " + maximo);
            System.out.println("La edad mínima es: " + minimo);
        } else {
            System.out.println("No se introdujo ninguna edad válida.");
        }
    }
}

