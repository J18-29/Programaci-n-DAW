import Prueba.Matematicas;
import Prueba.Persona;

public class Actividad1 {
    public static void main(String[] args) {
        Persona p = new Persona("José",18);
        p.imprimePersona();

        double a=4;
        double b=5;

        System.out.println(Matematicas.suma(a, b));
    }
}
