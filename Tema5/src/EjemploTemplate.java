public class EjemploTemplate {
    // Método para imprimir un array de doubles
    public static void imprimirArray(double[] array) {
        for (double elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    // Método para imprimir un array de enteros
    public static void imprimirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
}
   //Metodo generico (TEMPLATE)
    public static <T> void imprimirArrayGenerico(int[] arrayEnteros) {
          for (double elemento : arrayEnteros) {
                System.out.print(elemento + " ");
          }
          System.out.println();
     }

     public static void main(String[] args) {
        double[] arrayDoubles = {1.1, 2.2, 3.3};
        int[] arrayEnteros = {1, 2, 3};
        EjemploTemplate.imprimirArray(arrayDoubles);
        EjemploTemplate.imprimirArray(arrayEnteros);
        EjemploTemplate.imprimirArray(arrayDoubles);
        EjemploTemplate.imprimirArrayGenerico(arrayEnteros);

     }
}