package src;

import java.util.Scanner;
import java.util.Random;

public class Actividad5 {
    //Desarrolla un programa que trate de adivinar un número entre 1 y 100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;  // entre 1 y 100
        int intento;
        int intentos = 0;

        System.out.println("Adivina el número entre 1 y 100");

        do {
            System.out.print("Introduce un número: ");
            intento = sc.nextInt();
            intentos++;

            if (intento > numeroSecreto) { //Si el numero es mayor que el numero secreto;
                System.out.println("Demasiado alto");
            } else if (intento < numeroSecreto) { //Si el numero es menor que el numero secreto;
                System.out.println("Demasiado bajo");
            } else {
                System.out.println("¡Correcto! Adivinaste el número en " + intentos + " intentos.");
            }

        } while (intento != numeroSecreto);

        sc.close();
    }
}







