import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        int j=0;
        //Bucle infinito
        while(j<5){
            System.out.println(j);
            j++;
        }
        //Bucle do-while
        //int k=0;
        //do{ //Haz mientras se cumpla la condición, pero al menos1
            //System.out.println(k);
            //k++;
        //}while(k<5);

        //Cosas que no quiero ver en vuestros codigos
        //boolean continua=true;
        //or(int i=0;i<5;i++){
           // System.out.println(i);
            //if (i==3) break;
        //}

        //Hacerlo mejor con un bucle while
        //int j=0;
        //continua=true;
       // while (j<5 && continua) {
           // System.out.println(j);
           // if (j==3) continua=false;
           // j++;
       // }
         Scanner teclado =new Scanner(System.in);
         int numero=0;
         do{
            System.out.println("Escribe un número entre 1 y 5");
            numero=teclado.nextInt();
         }while(numero<1||numero>5);
   
   
    }

}
