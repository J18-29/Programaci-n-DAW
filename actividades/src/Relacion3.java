package src;

import java.util.Scanner;

public class Relacion3{

    public static void main(String[] args) {
        // Creamos un Scanner para leer los datos que ingrese el usuario
        Scanner entrada = new Scanner(System.in);

        // Pedimos el día de nacimiento
        System.out.print("Introduce el día de nacimiento: ");
        int dia = entrada.nextInt();

        // Pedimos el mes de nacimiento
        System.out.print("Introduce el mes de nacimiento (en número): ");
        int mes = entrada.nextInt();

        String signo = ""; // Aquí se guardará el signo del zodiaco

        // Comprobamos el mes y dentro de cada mes, el día, para asignar el signo
        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "ACUARIO";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "PISCIS";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "ARIES";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "TAURO";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "GÉMINIS";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "CÁNCER";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "LEO";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "VIRGO";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "LIBRA";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "ESCORPIO";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "SAGITARIO";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "CAPRICORNIO";
        } else {
            signo = "Fecha no válida";
        }

        // Mostramos el resultado
        System.out.println("Tu signo del zodiaco es: " + signo);

        // Cerramos el Scanner
        entrada.close();
    }
}

