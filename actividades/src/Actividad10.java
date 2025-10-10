

public class Actividad10 {
    //Defnimos los numeros pares
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
    //Definimos los numeros divisibles por 3
    public static boolean esDivisible3(int n) {
        return n % 3 == 0;
    }

    public static void imprimirParesDiv3() {
        for (int i = 1; i <= 20; i++) {
            if (esPar(i) && esDivisible3(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        imprimirParesDiv3();
    }
}
