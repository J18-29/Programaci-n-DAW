import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerBonoloto {
    public static void main(String[] args) {

        int[] bonoloto = new int[6];

        try {
            Scanner sc = new Scanner(new File("bonoloto.txt"));

            if (sc.hasNextLine()) {
                String linea = sc.nextLine();      // leer la línea
                String[] numeros = linea.split(","); // separar por comas

                for (int i = 0; i < numeros.length; i++) {
                    bonoloto[i] = Integer.parseInt(numeros[i].trim());
                }
            }

            sc.close();

            System.out.println("Números de la Bonoloto:");
            for (int n : bonoloto) {
                System.out.print(n + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero bonoloto.txt");
        }
    }
}
