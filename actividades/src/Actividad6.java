import java.util.Scanner;

public class Actividad6 {
    //Desarrolla un programa que simule una calculadora 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;

        System.out.println("=== Calculadora ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("Introduce -1 como primer número para salir.\n");

        while (true) {
            System.out.print("Elige una opción (1-4): ");
            opcion = sc.nextInt();

            System.out.print("Introduce el primer número: ");
            num1 = sc.nextDouble();

            if (num1 == -1) {
                System.out.println("Programa finalizado.");
                break;
            }

            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextDouble();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println(); // Espacio entre operaciones
        }

        sc.close();
    }
}

