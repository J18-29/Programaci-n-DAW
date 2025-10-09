import java.util.Scanner;

public class App {
    public static void main(String[]arg) throws Exception{
    String nombre1;
    String Apellidos1;
    int edad1;
    double notaBD1;
    double notaPROG1;

    double[] calificaciones={7,8,2,4,8,9};

    double calificaciones2[];

   System.out.println(calificaciones[0]);

  //  System.out.println("Introduce el tamaño del array");
  //  Scanner teclado= new Scanner(System.in);
  //  int numero=teclado.nextInt();
  calificaciones2=calificaciones;
  System.out.println(calificaciones2[0]);
  calificaciones=null;
  System.out.println(calificaciones[0]);
  }
}