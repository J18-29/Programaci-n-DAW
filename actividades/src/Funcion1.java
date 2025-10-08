package src;



public class Funcion1 {
   public static int numeroDigitos(int n) {
        int contador=0;
        while(n>0){
          n=n/10;
        contador++;   
        }
        return contador;
    }
    
    public static int numeroDigitosRecursivo(int n) {
        if(n>=0 && n<10){
            
        }
        return n;
    }

    public static int sumaNumeros(int n) {
        int suma=0;
        for (int i=1;i<=n;i++){
            suma+=1;
            
            }
           return suma;
        }
        public static int sumaNumerosRecursivos(int n){
            if(n==1)
              return 1;
            }
        private int n;
        else{
           
            return n+sumaNumerosRecursivos(n-1);
        }
    public static void main(String[] args) {
        int numero=234;
        System.out.println(numeroDigitos(numero));
        System.out.println(numeroDigitosRecursivo(numero));
        System.out.println(sumaNumeros(4));
    }

    public int getN() {
        return n;
    }

    

}
