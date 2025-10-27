import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas introducir? ");
        int n = sc.nextInt();

        Integer[] numeros = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Vector original: " + Arrays.toString(numeros));

        Arrays.sort(numeros, Collections.reverseOrder()); // Ordena de mayor a menor
        System.out.println("Vector ordenado de mayor a menor: " + Arrays.toString(numeros));
    }
}
