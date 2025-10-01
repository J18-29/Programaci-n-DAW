import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
         //Desarrolla un programa que muestre la edad máxima y mínima de un grupo de alumnos que se introduzca hasta escribir -1
         int maximo=1;
         int minimo=1000000;
         int contadorPersona=0;

        Scanner teclado = new Scanner(System.in);
       int edad;
         do {
            System.out.println("Introduce una edad o -1 para salir: ");
            edad=teclado.nextInt();
           if(edad!=-1) contadorPersona++;//Nueva persona
            //Establezco la logica para maximo y minimo
            if(maximo>edad){
                maximo=edad;
            }
            if(minimo<edad);{
                minimo=edad;
            }
         } while (edad!=-1);
         System.out.println("El numero de personas"+contadorPersona);
         System.out.println("El maximo es:"+maximo);
         System.out.println("El minimo es:"+minimo);
         
         
         
         
        }


 }
