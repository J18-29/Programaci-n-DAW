import java.util.ArrayList;
import java.util.Scanner;

public class Arrays9 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar un número");
            System.out.println("2. Eliminar un número");
            System.out.println("3. Mostrar todos los números");
            System.out.println("4. Comprobar si un número está en la lista");
            System.out.println("5. Eliminar todos los números");
            System.out.println("6. Consultar el tamaño de la lista");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número positivo: ");
                    int num = sc.nextInt();
                    while (num < 0) {
                        System.out.print("Número negativo, intenta de nuevo: ");
                        num = sc.nextInt();
                    }
                    lista.add(num);
                    break;
                case 2:
                    System.out.print("Número a eliminar: ");
                    int eliminar = sc.nextInt();
                    lista.removeIf(n -> n == eliminar);
                    break;
                case 3:
                    System.out.println("Lista completa: " + lista);
                    break;
                case 4:
                    System.out.print("Número a comprobar: ");
                    int comprobar = sc.nextInt();
                    if (lista.contains(comprobar)) {
                        System.out.println("El número está en la lista");
                    } else {
                        System.out.println("El número NO está en la lista");
                    }
                    break;
                case 5:
                    lista.clear();
                    System.out.println("Lista eliminada");
                    break;
                case 6:
                    System.out.println("Tamaño de la lista: " + lista.size());
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);
    }
}
