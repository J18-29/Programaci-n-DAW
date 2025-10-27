import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        int[] correcto = {5, 12, 23, 34, 45, 49};
        Scanner sc = new Scanner(System.in);
        int[] usuario = new int[6];

        System.out.println("Introduce tus 6 números de la Bonoloto:");
        for (int i = 0; i < 6; i++) {
            usuario[i] = sc.nextInt();
        }

        int aciertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (usuario[i] == correcto[j]) {
                    aciertos++;
                }
            }
        }

        System.out.println("Número de aciertos: " + aciertos);
    }
}
