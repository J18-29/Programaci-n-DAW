import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        //Desarrolla un programa que calcule la suma,media, número de alumnos y cuántos son mayores de edad
        Scanner sc = new Scanner(System.in);

        int edad;
        int suma = 0;
        int contador = 0;
        int mayores = 0;

        System.out.println("Escribe edades de alumnos (escribe -1 para terminar):");

        edad = sc.nextInt();

        while (edad != -1) {
            suma += edad;
            contador++;

            if (edad >= 18) {
                mayores++;
            }

            edad = sc.nextInt();
        }

        if (contador > 0) {
            double media = (double) suma / contador;

            System.out.println("Suma de edades: " + suma);
            System.out.println("Media: " + media);
            System.out.println("Número de alumnos: " + contador);
            System.out.println("Mayores de edad: " + mayores);
        } else {
            System.out.println("No se ingresaron datos.");
        }

        sc.close();
    }
}

        

