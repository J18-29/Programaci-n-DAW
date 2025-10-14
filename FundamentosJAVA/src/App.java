import java.util.Scanner;

public class App {
  public static double devolverArrray(double[]) {
    
  }
    /**
     * @param arg
     * @throws Exception
     */
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

//Arrays que apuntan al mismo sitio
double[] calificacionesOtro;
calificacionesOtro=calificaciones;
System.out.println(calificaciones[3]);
System.out.println(calificacionesOtro[3]);
calificaciones=null;
System.out.println(calificacionesOtro[3]);

//Imprime la posicion 1
imprimeArray(calificaciones);
double[] resultado=devolverArrray(calificaciones);
System.out.println(resultado[1]);

//Usar la memoria dinamica reservada
calificaciones2[3]=5;
System.out.println(calificaciones2[3]);
System.out.println(calificaciones2[1]);

int[][] matriz={{1,2},{3,4}}; 
for(int i=0;i<2;i++){ 
  for (int j=0;j<2;j++) System.out.print(matriz[i][j]+" "); 
  System.out.println(); } 
  }
 
}