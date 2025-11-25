package Examen;

import java.util.ArrayList;
import java.util.Scanner;


public class Examen1 {
    public static void main(String[] args) {
        
        //Creamos una lista con los temas ya estudiados
        ArrayList<Integer> correcto = new ArrayList<>();
        correcto.add(4);
        correcto.add(11);
        correcto.add(23);
        correcto.add(34);
        correcto.add(35);
        correcto.add(36);
        correcto.add(39);
        correcto.add(50);
        correcto.add(60);
        correcto.add(65);
        
        // Scanner para leer los números introducidos por el usuario
        Scanner sc = new Scanner(System.in);
        // Lista donde guardaremos los números del usuario
        ArrayList<Integer> usuario = new ArrayList<>();

         // Pedimos al usuario que introduzca sus bolas
        System.out.println("Introduce tus 5 bolas:");
        for (int i = 0; i < 5; i++) {
            usuario.add(sc.nextInt()); // Añadimos cada número a la lista
        }

        int aciertos = 0; // Contador de aciertos

        // Comprobamos si estos numeros alguno esta en la lista
        for (int n : usuario) {
            if (correcto.contains(n)) { // contains() verifica si el número está en la lista
                aciertos++;
            }
        }

        // Mostramos el número total de aciertos
        System.out.println("Número de aciertos: " + aciertos);

    }
}
