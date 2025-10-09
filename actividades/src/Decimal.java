

public class Decimal {
   //Método recursivo para pasar un número decimal, que es positivo, y pasarlo a binario mediantesucesivas divisiones por 2
     public static String pasarBinario(int n){
         String cadena = "";
        if(n==0){
            return cadena;
        }
         else{
            cadena=cadena+n%2;
            pasarBinario(n/2);
         }
        return cadena ;
    }



}
