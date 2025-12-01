package Clases.BlackJack;

import java.util.ArrayList;

public class Jugadores {

    protected String nombre;
    protected ArrayList<Cartas> mano = new ArrayList<>();
    protected int fondos;

    public Jugadores(String nombre) {
        this.nombre = nombre;
    }

    public void addCarta(Cartas c) {
        mano.add(c);
    }

    public void limpiarMano() {
        mano.clear();
    }

    public int calcularPuntos() {
        int total = 0;
        int ases = 0;

        for (Cartas c : mano) {
            total += c.getValorJuego();
            if (c.getValor().equals("A")) ases++;
        }

        while (total > 21 && ases > 0) {
            total -= 10; 
            ases--;
        }

        return total;
    }

    public void mostrarMano() {
        System.out.println(nombre + " tiene:");
        for (Cartas c : mano) {
            System.out.println(" - " + c);
        }
        System.out.println("Total: " + calcularPuntos());
    }
}

