import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Persona {
    // === Atributos ===
    private String dni;
    private LocalDate fechaNacimiento;
    public int hijos;
    private Persona pareja;

    // === Constructores ===
    public Persona(String dni, String fechaNacimiento) {
        this.dni = dni;
        this.hijos = 0; // por defecto
        setFechaNacimiento(fechaNacimiento);
    }

    public Persona(String dni, String fechaNacimiento, int hijos) {
        this.dni = dni;
        this.hijos = hijos;
        setFechaNacimiento(fechaNacimiento);
    }

    // === Setter con control de formato de fecha ===
    public void setFechaNacimiento(String fechaNacimiento) {
        try {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/M/yyyy");
            this.fechaNacimiento = LocalDate.parse(fechaNacimiento, formato);
        } catch (DateTimeParseException e) {
            System.out.println("⚠️ Error: formato de fecha incorrecto. Usa formato dd/MM/yyyy");
            this.fechaNacimiento = null;
        }
    }

    // === Obtener edad ===
    public int obtenerEdad() {
        if (fechaNacimiento == null) {
            System.out.println("No se puede calcular edad: fecha no válida");
            return -1;
        }
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        System.out.println("Tienes " + edad + " años");
        return edad;
    }

    // === Asigna pareja ===
    public void asignaPareja(Persona p) {
        this.pareja = p; // referencia al mismo objeto
    }

    // === Mostrar datos ===
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        if (fechaNacimiento != null)
            System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Hijos: " + hijos);
        if (pareja != null) {
            System.out.println("Pareja: " + pareja.dni);
        } else {
            System.out.println("Pareja: no tiene");
        }
        System.out.println("------------------------");
    }

    // === MAIN ===
    public static void main(String[] args) {
        // 1) Crear personas
        Persona p = new Persona("12345678A", "15/08/1985");
        Persona p2 = new Persona("12345678B", "1/07/1987");

        // 2) Mostrar edad y número de hijos
        p.obtenerEdad();
        System.out.println("Tienes " + p.hijos + " hijos");

        // 3) Cambiar hijos de p y ver efecto
        p.hijos = 3;
        System.out.println("Tienes " + p2.hijos + " hijos (de p2, antes de asignar pareja)");

        // 4) Asignar pareja y mostrar datos
        p.asignaPareja(p2);
        p.mostrarDatos();
        p2.mostrarDatos();

        // 5) Cambiar un atributo de p2 (número de hijos)
        p2.hijos = 2;
        System.out.println("Después de cambiar los hijos de p2:");
        p.mostrarDatos();
        p2.mostrarDatos();

        // 6) Intentar insertar fecha con formato erróneo
        Persona p3 = new Persona("98765432C", "1987-01-05");
        p3.obtenerEdad();
    }
}
