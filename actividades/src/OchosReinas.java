import java.util.Scanner;

public class OchosReinas {

    static final int N = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tablero = new int[N][N];

        System.out.print("Introduce la columna (0-7) para la primera reina: ");
        int primeraColumna = sc.nextInt();

        // Colocar la primera reina en la fila 0
        tablero[0][primeraColumna] = 1;

        // Intentar resolver el resto
        if (resolver(tablero, 1)) {
            System.out.println("\nSolución encontrada:");
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solución con la reina en esa columna.");
        }

        sc.close();
    }

    // Función recursiva
    static boolean resolver(int[][] tablero, int fila) {
        if (fila == N) return true; // Solución completa

        for (int col = 0; col < N; col++) {
            if (esSeguro(tablero, fila, col)) {
                tablero[fila][col] = 1;
                if (resolver(tablero, fila + 1)) return true;
                tablero[fila][col] = 0; // retroceder
            }
        }
        return false;
    }

    static boolean esSeguro(int[][] tablero, int fila, int col) {
        // Comprobar columna
        for (int i = 0; i < fila; i++)
            if (tablero[i][col] == 1)
                return false;

        // Diagonal superior izquierda
        for (int i = fila - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (tablero[i][j] == 1)
                return false;

        // Diagonal superior derecha
        for (int i = fila - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (tablero[i][j] == 1)
                return false;

        return true;
    }

    static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }
}
