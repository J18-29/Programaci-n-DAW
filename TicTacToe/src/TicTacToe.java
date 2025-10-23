import java.util.Scanner;

public class TicTacToe {
    static int[][] matriz = new int[3][3];
    static boolean turno = true;
    final static int JUEGO1 = 1;
    final static int JUEGO2 = 2;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int posicion;

        imprimeMatriz(matriz);

        for (int i = 0; i < 9; i++) {
            System.out.println("Turno del jugador " + (turno ? "1" : "2"));
            System.out.print("Introduce una posición del 1 al 9: ");
            posicion = teclado.nextInt();

            if (!jugada(matriz, turno, posicion)) {
                System.out.println("Posición ocupada o inválida. Intenta de nuevo.");
                i--; // No contamos este turno
                continue;
            }

            imprimeMatriz(matriz);

            if (comprobarGanador(matriz, turno)) {
                System.out.println("¡Ganó el jugador " + (turno ? "1" : "2") + "!");
                break;
            }

            turno = !turno;
        }

        System.out.println("Fin del juego.");
        teclado.close();
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                char simbolo;
                if (matriz[i][j] == JUEGO1) simbolo = 'X';
                else if (matriz[i][j] == JUEGO2) simbolo = 'O';
                else simbolo = '-';
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }
    }

    public static boolean jugada(int[][] matriz, boolean turno, int posicion) {
        int valor = turno ? JUEGO1 : JUEGO2;
        int fila = (posicion - 1) / 3;
        int columna = (posicion - 1) % 3;

        if (posicion < 1 || posicion > 9) return false;
        if (matriz[fila][columna] != 0) return false;

        matriz[fila][columna] = valor;
        return true;
    }

    public static boolean comprobarGanador(int[][] matriz, boolean turno) {
        int valor = turno ? JUEGO1 : JUEGO2;

        for (int i = 0; i < 3; i++) {
            if (compruebaFila(i, valor) || compruebaColumna(i, valor)) return true;
        }

        if (compruebaDiagonal1(valor) || compruebaDiagonal2(valor)) return true;

        return false;
    }

    public static boolean compruebaFila(int fila, int valor) {
        return matriz[fila][0] == valor && matriz[fila][1] == valor && matriz[fila][2] == valor;
    }

    public static boolean compruebaColumna(int columna, int valor) {
        return matriz[0][columna] == valor && matriz[1][columna] == valor && matriz[2][columna] == valor;
    }

    public static boolean compruebaDiagonal1(int valor) {
        return matriz[0][0] == valor && matriz[1][1] == valor && matriz[2][2] == valor;
    }

    public static boolean compruebaDiagonal2(int valor) {
        return matriz[0][2] == valor && matriz[1][1] == valor && matriz[2][0] == valor;
    }
}
