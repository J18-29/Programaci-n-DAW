package Prueba;

public class Persona {
    String nombre;
    int edad;

    public Persona(){

    }
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void setNombre(String cadena){
        this.nombre=cadena;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int años){
        this.edad=años;
    }
    public int getEdad(int años){
        return this.edad;
    }
    public void imprimePersona() {
       
        
    }
}
