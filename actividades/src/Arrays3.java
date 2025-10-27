import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 2, 9, 1};
        int[] resultado = maxMin(numeros);
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Máximo: " + resultado[0] + ", Mínimo: " + resultado[1]);
    }

    public static int[] maxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        return new int[]{max, min};
    }
}
