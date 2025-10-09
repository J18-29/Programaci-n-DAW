import java.util.Scanner;

public class Actividad13{

    // Método recursivo que convierte un número decimal a binario
    public static String decimalABinario(int numero) {
        // Caso base: cuando el número es 0 o 1
        if (numero < 2) {
            return Integer.toString(numero);
        }
        // Llamada recursiva: divide el número por 2 y concatena el residuo
        return decimalABinario(numero / 2) + (numero % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal positivo: ");
        int numero = sc.nextInt();

        // Comprobamos que el número sea positivo
        if (numero < 0) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
            String binario = decimalABinario(numero);
            System.out.println("El número en binario es: " + binario);
        }

        sc.close();
    }
}
