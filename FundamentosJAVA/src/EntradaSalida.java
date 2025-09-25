public class EntradaSalida{
    public static void main(String[] args) {
            //Instrucciones de salida por pantalla
            int valor=7;
            System.out.print(valor);

            //Usar printf
            double precio=1300000.354789;
            System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d" ,"Tablet",precio,valor);
            //Incluir un icono
            System.out.println("Que ganas tengo de unas vacaciones");

            //Formato reciente de System
            System.out.println("El precio del producto "+"Tablet "+"tique un valor de "+precio+" y se han comprado "+valor);
            //Formato salida texto
            System.out.printf("%15s, %-15s","José","Informatico");

            //Formato tabla
            System.out.println("|----------|----------|----------|");
            System.out.printf("|%-10s|%-10s|%10s|\n","Producto","Cantidad","Valor");
            System.out.println("|----------|----------|----------|");
            System.out.printf("|%-10s|%d|%f|\n","Producto",valor,precio);

            System.out.println("|----------|----------|----------|");
            System.out.println("|"+"Producto"+"|"+"Cantidad"+"|"+"Precio"+"|");
            System.out.println("|----------|----------|----------|");
            System.out.println("|"+"Tablet"+"   |   "+valor+"    |   "+precio+"   |");
            System.out.println("|----------|----------|----------|");
        
        
        
        }

    
}
