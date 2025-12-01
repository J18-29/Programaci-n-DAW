package Clases.BlackJack;

public class Cartas {
    private String valor; 
    private String palo;

    public Cartas(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public int getValorJuego() {
        if ("JQK".contains(valor)) return 10;
        if ("A".equals(valor)) return 11;
        return Integer.parseInt(valor);
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }
}
