
import java.security.SignedObject;
import java.time.LocalDateTime;

public class Funciones {

    
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
 System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
 System.out.println("El día es: " + hoy.getDayOfMonth());
 System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
 System.out.println("El año es: " + hoy.getYear());
 System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

 //Tratamiento de Math
 System.out.println(Math.pow(2,8));
  //Números aleatorios
  int min=1;
  int max=15;
   int aleatorios=(int)(Math.random()*(max-min+1))+min;
   System.out.println(aleatorios);

   
   //Operadores
   //++ y --
   //No es lo mismo variable++ que ++variable
   int valor=1;
   valor=--valor;//Forzar la diferencia,tú pondras en codigo solo--valor
   System.out.println(valor);
   valor=valor-1;
   System.out.println(valor);

   System.out.println((5>3)&&(5>6));

   //Operador opera-asigna
   int numero11=3;
   int numero12=4;
   numero11+=numero12;
   System.out.println(numero11);
    
   

     
    //Operador ternario
   int a=10,b=5;
   int x=a==10 ? b*2:a;
   System.out.println(x);
 

   //Comprobar si un Número es divisible por 2 y 3
     //Si numero%2 es 0 Y numero%3 es 0 entonces
        //escribir numero es divisible por 2 y 3
   

  
}
}