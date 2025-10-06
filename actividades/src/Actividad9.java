import java.util.Scanner;

public class Actividad9 {
    final static double PI=3.14159;
    public static void main(String[] args) {
    //calcular el área y volumen de un cilindro (2*PI*(altura+radio), PI*radio2*altura)
     Scanner teclado=new Scanner(System.in);
     double altura;
     double radio;
     //leer parametros

     System.out.println("Escribe la altura y radio del cilindro: ");
     altura= teclado.nextDouble();
     radio=teclado.nextDouble();
     imprimeCilindro(altura, radio);
    }
    public static void imprimeCilindro(double altura,double radio){
        System.out.println("El area del cilindro es: "+(altura*radio*PI));
          System.out.println("El VOLUMEN del cilindro es: "+(altura*radio*PI));
     }
}