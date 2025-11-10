public class NuevoLaberinto {

    public static void main(String[] args) {
        // Ejemplo de laberinto: 0 = camino libre, # = pared
        char[][] laberinto = {
            {'0', '0', '#', '0'},
            {'#', '0', '#', '0'},
            {'0', '0', '0', '0'},
            {'0', '#', '#', '0'}
        };

        int N = laberinto.length;
        int[][] solucion = new int[N][N];

        if (resolverDesde(0, 0, laberinto, solucion)) {
            imprimirSolucion(solucion);
        } else {
            System.out.println("No existe camino");
        }
    }

    // === FUNCIÓN resolverDesde ===
    public static boolean resolverDesde(int x, int y, char[][] laberinto, int[][] solucion) {
        int N = laberinto.length;

        // Caso base: si llegamos a la salida
        if (x == N - 1 && y == N - 1 && laberinto[x][y] == '0') {
            solucion[x][y] = 1;
            return true;
        }

        // Si la posición es segura
        if (esSeguro(x, y, laberinto)) {
            // Marcar la posición actual como parte del camino
            solucion[x][y] = 1;

            // Mover abajo
            if (resolverDesde(x + 1, y, laberinto, solucion))
                return true;

            // Mover derecha
            if (resolverDesde(x, y + 1, laberinto, solucion))
                return true;

            // Mover arriba
            if (resolverDesde(x - 1, y, laberinto, solucion))
                return true;

            // Mover izquierda
            if (resolverDesde(x, y - 1, laberinto, solucion))
                return true;

            // Retroceder (backtracking)
            solucion[x][y] = 0;
            return false;
        }

        return false;
    }

    // === FUNCIÓN esSeguro ===
    public static boolean esSeguro(int x, int y, char[][] laberinto) {
        int N = laberinto.length;
        return (x >= 0 && x < N && y >= 0 && y < N && laberinto[x][y] == '0');
    }

    // === FUNCIÓN imprimirSolucion ===
    public static void imprimirSolucion(int[][] solucion) {
        System.out.println("Camino encontrado:");
        for (int i = 0; i < solucion.length; i++) {
            for (int j = 0; j < solucion[i].length; j++) {
                System.out.print(solucion[i][j] + " ");
            }
            System.out.println();
        }
    }
}
