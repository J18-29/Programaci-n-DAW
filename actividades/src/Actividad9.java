

import java.util.Scanner;

public class Actividad9 {
    final static double PI = 3.14159;

    public static void main(String[] args) {
        // Calcular el área y volumen de un cilindro: 
        // Área = 2 * PI * r * (r + h)
        // Volumen = PI * r^2 * h

        Scanner teclado = new Scanner(System.in);
        double altura;
        double radio;

        // Leer parámetros
        System.out.println("Escribe la altura y el radio del cilindro: ");
        altura = teclado.nextDouble();
        radio = teclado.nextDouble();

        imprimeCilindro(altura, radio);
    }

    public static void imprimeCilindro(double altura, double radio) {
        double area = 2 * PI * radio * (radio + altura);
        double volumen = PI * radio * radio * altura;

        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);
    }
}
