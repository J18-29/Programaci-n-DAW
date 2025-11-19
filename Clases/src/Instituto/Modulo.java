package Instituto;

import java.util.ArrayList;
import java.util.List;

public class Modulo {
    int codigo;
    String nombre;
      Profesor profesor;// 1 profesor
     List<Alumno> alumnos = new ArrayList<>();  // muchos alumnos

    public Modulo(){}

    public Modulo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public void addAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    @Override
    public String toString() {
        return "Modulo [codigo=" + codigo + ", nombre=" + nombre + "]";
    }
    
}
