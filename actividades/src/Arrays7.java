import java.util.Random;
import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();

        // Llenar la matriz con números aleatorios entre 0 y 100
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(101);
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        int[][] rotada = rotarMatriz(matriz);

        System.out.println("Matriz rotada una posición en sentido horario:");
        imprimirMatriz(rotada);
    }

    public static int[][] rotarMatriz(int[][] mat) {
        int n = mat.length;
        int[][] nueva = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ni = j;
                int nj = n - 1 - i;
                nueva[ni][nj] = mat[i][j];
            }
        }

        return nueva;
    }

    public static void imprimirMatriz(int[][] mat) {
        for (int[] fila : mat) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
