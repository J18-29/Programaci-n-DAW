import java.util.ArrayList;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        ArrayList<Integer> correcto = new ArrayList<>();
        correcto.add(5);
        correcto.add(12);
        correcto.add(23);
        correcto.add(34);
        correcto.add(45);
        correcto.add(49);

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> usuario = new ArrayList<>();

        System.out.println("Introduce tus 6 números de la Bonoloto:");
        for (int i = 0; i < 6; i++) {
            usuario.add(sc.nextInt());
        }

        int aciertos = 0;
        for (int n : usuario) {
            if (correcto.contains(n)) {
                aciertos++;
            }
        }

        System.out.println("Número de aciertos: " + aciertos);
    }
}
