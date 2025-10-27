import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matriz2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        double[][] resultado = combinarMatrices(matriz1, matriz2);

        System.out.println("Matriz resultado:");
        for (double[] fila : resultado) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static double[][] combinarMatrices(int[][] m1, int[][] m2) {
        int filas = m1.length;
        int columnas = m1[0].length;

        double[][] resultado = new double[filas][3]; // 3 columnas: suma, producto, media

        for (int i = 0; i < filas; i++) {
            int suma = 0;
            int producto = 1;
            for (int j = 0; j < columnas; j++) {
                suma += m1[i][j] + m2[i][j];
                producto *= m1[i][j] * m2[i][j];
            }
            double media = suma / (double) columnas;
            resultado[i][0] = suma;
            resultado[i][1] = producto;
            resultado[i][2] = media;
        }

        return resultado;
    }
}
