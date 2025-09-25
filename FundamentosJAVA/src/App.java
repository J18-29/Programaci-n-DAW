public class App {
   public static boolean logico=true;
    final static double PI=3.141592; 
      public static void main(String[] args) throws Exception{
          // (TIPO) IDENTIFICADOR = VALOR;
        String cadena="me llamo Domingo";
        int edad=40;
        double salario=13;
        int x=5;
        int y=7;
        int z=10;
        //Defino una variable y la inicializo y la imprimo
        int variable=0;
        System.out.println(variable);

        variable=33;
        System.out.println(variable);
        int resultado=1/3;
        double resultado2=1/3.0;
       
       System.out.println(resultado);
       System.out.println(resultado2);
         
         int a=(int)2.6;
         System.out.println(a);

         boolean logico=true; //false
         System.out.println(App.logico);

        final double PI=3.141592;
        
       
        }

           public static void imprimirTexto(){
            int b='b'; //Un caracter se guarda en un enter segun ASCII
           char c=98;
           System.out.println(b+" "+c);
           System.out.println(b);

           System.out.println("hola");
           System.err.println("un bonito error");
          
    }
}
