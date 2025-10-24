import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        //Crear el vector dinamico
        int[] vector=null;
        //Inserta un valor
        vector=push(vector, 3);
        //Inserta un valor
        vector=push(vector, 5);
          Scanner teclado=new Scanner(System.in);
         System.out.println("Introduce la cantidad de numeros que desee:");
         vector=push(vector,teclado.nextInt());
         System.out.println("Su numero es:" + vector[1] + vector[2]);
         System.out.println( vector[2]);
        
        //Elimina el último
        int valor=pop(vector);
        System.out.println(valor);
        
    }
    public static int[]push(int[] array, int valor){
        int longitud;
        if (array==null) {longitud=0;}
        else {longitud=array.length;}
           //Crear el array con +1 de tamaño
           int[] salida=new int[longitud+1];
           for(int i=0;i<longitud;i++){
                salida[i]=array[i];
           }
           salida[longitud]=valor;
           return salida;
    }

    public static int pop(int [] array){
        int valor=array[array.length-1];
        int[] nuevo=new int[array.length];
        //Copiar hasta el tamaño de nuevo
        for(int i=0;i<nuevo.length;i++){
            nuevo[i]=array[i];
        }
        array=nuevo;
        return valor;
    }
}
