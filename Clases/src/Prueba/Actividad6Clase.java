package Prueba;

import clases.Ejemplar;
import clases.Empleado;
import clases.Periodista;
import clases.Revista;
import clases.Seccion;
import clases.Surcursal;

public class Actividad6Clase{
    public static void main(String[] args) {
        Surcursal sur= new Surcursal(234, "C/menor 34", "Albanchez", "Almeria", "234945618");
        Revista revis= new Revista(12, "Secretos del mar", "Catalogo", "20 años");
        Seccion sec= new Seccion("Historia", 20);
        Ejemplar ejem= new Ejemplar("20/12/2000", 45, 10);
        Periodista perio= new Periodista(789, "Paco", "Lopez", "Vega", "761239012", "lector");
        Empleado empl= new Empleado(3456, "3455828", "Luisa", "Hernandez", "Valdero", "284932034");
    
        System.out.println(sur);
        System.out.println(revis);
        System.out.println(sec);
        System.out.println(ejem);
        System.out.println(perio);
        System.out.println(empl);
    
    }
}