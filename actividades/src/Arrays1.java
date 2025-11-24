import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        // Crear un "vector dinámico" inicializado en null
        int[] vector = null;

        // Insertar valores usando el método push
        vector = push(vector, 3);
        vector = push(vector, 5);

        // Leer un número desde el teclado y añadirlo al vector
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números que desees:");
        vector = push(vector, teclado.nextInt());

        // Mostrar algunos elementos del vector
        // Atención: se concatenan los valores directamente, puede resultar confuso
        System.out.println("Su número es:" + vector[1] + vector[2]);
        System.out.println(vector[2]);

        // Eliminar el último elemento con el método pop
        int valor = pop(vector);
        System.out.println(valor);
    }

    // Método para añadir un valor al final de un array (simula un "push")
    public static int[] push(int[] array, int valor) {
        int longitud;
        if (array == null) {
            longitud = 0; // Si es null, la longitud inicial es 0
        } else {
            longitud = array.length;
        }

        // Crear un array nuevo con un elemento más
        int[] salida = new int[longitud + 1];

        // Copiar los elementos antiguos al nuevo array
        for (int i = 0; i < longitud; i++) {
            salida[i] = array[i];
        }

        // Añadir el nuevo valor al final
        salida[longitud] = valor;

        return salida; // Devolver el nuevo array
    }

    // Método para eliminar el último elemento del array (simula un "pop")
    public static int pop(int[] array) {
        // Guardar el último valor
        int valor = array[array.length - 1];

        // Crear un nuevo array (nota: actualmente no se reduce el tamaño, solo copia)
        int[] nuevo = new int[array.length];
        for (int i = 0; i < nuevo.length; i++) {
            nuevo[i] = array[i];
        }
        array = nuevo; // Esto no cambia el array original en main

        return valor; // Devolver el valor eliminado
    }
}
