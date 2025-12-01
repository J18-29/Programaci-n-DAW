package Clases.BlackJack;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

    private ArrayList<Cartas> cartas = new ArrayList<>();
    private String[] palos = {"Corazones", "Picas", "Treboles", "Diamantes"};
    private String[] valores = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    public Baraja() {
        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new Cartas(valor, palo));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Cartas repartirCarta() {
        return cartas.remove(0);
    }
}
