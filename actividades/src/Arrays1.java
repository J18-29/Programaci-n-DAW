import java.util.Scanner;

public class Arrays1 {

    public static void main(String[] args) {

        // Crear un "vector dinámico" inicializado en null
        int[] vector = null;

        // Añadir elementos al vector usando push
        vector = push(vector, 3); // Añadir 3
        vector = push(vector, 5); // Añadir 5

        // Leer un número desde el teclado y añadirlo al vector
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números que desees:");
        vector = push(vector, teclado.nextInt());

        // Mostrar algunos elementos del vector
        // Nota: usamos comas para que no se concatenen como texto
        System.out.println("vector[1]: " + vector[1] + ", vector[2]: " + vector[2]);

        // Eliminar el último elemento con pop
        // pop devuelve un objeto que contiene el array reducido y el valor eliminado
        ResultadoPop resultado = pop(vector);
        vector = resultado.array; // Actualizamos el array original
        int valor = resultado.ultimo; // Obtenemos el valor eliminado

        // Mostrar el valor eliminado
        System.out.println("Valor eliminado: " + valor);
    }

    // Clase auxiliar para almacenar el resultado de pop
    // Contiene el nuevo array (sin el último elemento) y el valor eliminado
    static class ResultadoPop {
        int[] array;
        int ultimo;

        ResultadoPop(int[] a, int u) {
            array = a;
            ultimo = u;
        }
    }

    // Método para añadir un valor al final de un array (simula push)
    public static int[] push(int[] array, int valor) {
        int longitud = (array == null) ? 0 : array.length; // Determinar longitud actual
        int[] salida = new int[longitud + 1]; // Crear un array con espacio extra

        // Copiar elementos existentes al nuevo array
        for (int i = 0; i < longitud; i++) {
            salida[i] = array[i];
        }

        // Añadir el nuevo valor al final
        salida[longitud] = valor;

        return salida; // Devolver el nuevo array con el valor añadido
    }

    // Método para eliminar el último elemento del array (simula pop)
    public static ResultadoPop pop(int[] array) {
        int ultimo = array[array.length - 1]; // Guardar el último valor

        // Crear un nuevo array con un elemento menos
        int[] nuevo = new int[array.length - 1];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = array[i]; // Copiar los elementos restantes
        }

        // Devolver un objeto con el array reducido y el valor eliminado
        return new ResultadoPop(nuevo, ultimo);
    }
}
