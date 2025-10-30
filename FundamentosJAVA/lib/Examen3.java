package FundamentosJAVA.lib;

import java.util.Scanner;

public class Examen3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Introduce números (nº negativo para terminar):");
        do {
            numero = sc.nextInt();  // Lee un número que introduces
            if (numero > 0) {
                numero++;  
            } else if (numero < 0) {
                  
            }
        // Si es nº negativo, termina el bucle
        } while (numero < 0);
          
         // Mostrar resultados
        System.out.println("Has introducido " + numero + " números.");
    }
}