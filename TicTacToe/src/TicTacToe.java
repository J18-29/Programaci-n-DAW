import java.util.Scanner;

public class TicTacToe {
    //Crear la matriz
    static int[][] matriz={{0,0,0},{0,0,0},{0,0,0}};
    //Varible de turno
    static boolean turno=true;
    final static int JUEGO1=1;
    final static int JUEGO2=2;
    
    public static void main(String[] args){
         Scanner teclado=new Scanner(System.in);
         int posicion;
         //Mostrar situacion inicial
         imprimeMatriz(matriz);
        imprimeMatriz(matriz);
    
        for(int i=0;i<9;i++){
        System.out.println("Introduce coordenada del 1 al 9: ");
        posicion=teclado.nextInt();
        jugada(matriz,turno, posicion);
       imprimeMatriz(matriz);
        turno=!turno;

        }
    

    }
    public static void imprimeMatriz (int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"");
            }
            System.out.println();
        }
    }
    

   public static void jugada(int[][] matriz, boolean turno, int posicion) {
       int valor;
        if (turno==true) valor=JUEGO1;
        else{ valor=JUEGO2;}
        switch (posicion) {
            case 1:
                matriz[0][0]=valor;
                break;
            case 2:
               matriz[0][1]=valor;
               break;
               case 3:
                matriz[01][1]=valor;
                break;
                case 4:
                matriz[0][0]=valor;
                break;
                case 5:
                matriz[1][1]=valor;
                break;
                case 6:
                matriz[1][2]=valor;
                break;
                case 7:
                matriz[2][0]=valor;
                break;
                case 8:
                matriz[02][1]=valor;
                break;
                case 9:
                matriz[2][2]=valor;
                break;
           
        }
      
       }
       public static boolean comprobarGanador(int[][] matriz, boolean turno){
        //Determinar el valor a buscar en la matriz
        int valor;
        if(turno==true) valor=JUEGO1;
        else{valor=JUEGO2;}
        //Ganar en la fila 0
        if(compruebaFila(0,valor) || compruebaFila(1,valor)||compruebaFila(2,valor)) return true;
        else if (compruebaColumna(0,valor) || compruebaColumna(1,valor)||compruebaColumna(2,valor)) return true; // Gana por columnas?
        else if (compruebaDiagonal1(valor)||compruebaDiagonal2(valor)); // Gana por diagonales?
        else return false; //NO HAS GANADO
        

       }
       public static boolean compruebaDiagonal1(int valor){
        if(matriz[0][0]==valor && matriz[1][1]== valor && matriz[2][2]==valor) return true;
        return false;
       }
        public static boolean compruebaDiagonal2(int valor){
        if(matriz[0][2]==valor && matriz[1][1]== valor && matriz[2][0]==valor) return true;
        return false;
       }
       public static boolean compruebaFila(int fila,int valor){
         if(matriz[0][0]==valor && matriz[0][1]==valor && matriz[0][2]==valor) return true;
         return false;
       }
       public static boolean compruebaColumna(int columna,int valor){
        if(matriz[0][columna]==valor && matriz[0][columna]==valor && matriz[0][columna]==valor) return true;
         return false;
       }
    }
   

