package src;

import java.util.Scanner;

public class Actividad7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los números al usuario
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();

        // Nos aseguramos de que sean positivos
        a = Math.abs(a);
        b = Math.abs(b);

        // Tomamos el mayor de los dos números
        int mayor = Math.max(a, b);
        int mcm = mayor;

        // Repetimos hasta encontrar un número divisible por ambos
        while (mcm % a != 0 || mcm % b != 0) {
            mcm += mayor;
        }

        // Mostramos el resultado
        System.out.println("El mcm es: " + mcm);

        sc.close();
    }
}
