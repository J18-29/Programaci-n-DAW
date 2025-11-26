package Clases.JRol;

public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private Tipo tipo;

    public Personaje(String nombre, int vida, int ataque, int defensa, Tipo tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirDaño(int daño) {
        if (daño < 0) daño = 0;
        vida -= daño;
        if (vida < 0) vida = 0;
    }

    public void atacar(Personaje enemigo) {
        int daño = this.ataque - enemigo.defensa;
        enemigo.recibirDaño(daño);
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ") Vida:" + vida + " Atq:" + ataque + " Def:" + defensa;
    }
}
