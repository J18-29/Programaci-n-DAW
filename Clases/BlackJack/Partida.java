package Clases.BlackJack;
import java.util.Scanner;

public class Partida {

    private Jugadores jugador;
    private Crupier crupier;
    private Baraja baraja;

    private int victoriasJugador = 0;
    private int victoriasCrupier = 0;

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        jugador = new Jugadores(sc.nextLine());
        jugador.fondos = 100;

        crupier = new Crupier();

        while (jugador.fondos > 0) {

            System.out.println("\n--- NUEVA PARTIDA ---");
            baraja = new Baraja();
            baraja.barajar();

            jugador.limpiarMano();
            crupier.limpiarMano();

            System.out.println("Tienes " + jugador.fondos + "€. ¿Cuánto deseas apostar?");
            int apuesta = sc.nextInt();

            while (apuesta > jugador.fondos || apuesta <= 0) {
                System.out.println("Apuesta no válida. Intenta de nuevo:");
                apuesta = sc.nextInt();
            }

            jugador.addCarta(baraja.repartirCarta());
            jugador.addCarta(baraja.repartirCarta());
            crupier.addCarta(baraja.repartirCarta());

            turnoJugador(sc);

            if (jugador.calcularPuntos() > 21) {
                System.out.println("Te pasaste. Pierdes la apuesta.");
                jugador.fondos -= apuesta;
                victoriasCrupier++;
                continue;
            }

            turnoCrupier();

            determinarGanador(apuesta);
        }

        System.out.println("\n Te has quedado sin dinero. Fin del juego.");
        System.out.println("Victorias jugador: " + victoriasJugador);
        System.out.println("Victorias crupier: " + victoriasCrupier);
    }

    private void turnoJugador(Scanner sc) {
        String opcion;
        do {
            jugador.mostrarMano();
            System.out.print("¿Quieres otra carta? (s/n): ");
            opcion = sc.next();

            if (opcion.equalsIgnoreCase("s")) {
                jugador.addCarta(baraja.repartirCarta());
            }

        } while (opcion.equalsIgnoreCase("s") && jugador.calcularPuntos() < 21);
    }

    private void turnoCrupier() {
        System.out.println("\nTurno del crupier:");
        crupier.mostrarMano();

        while (crupier.calcularPuntos() < 17) {
            System.out.println("El crupier toma una carta...");
            crupier.addCarta(baraja.repartirCarta());
            crupier.mostrarMano();
        }
    }

    private void determinarGanador(int apuesta) {
        int totalJugador = jugador.calcularPuntos();
        int totalCrupier = crupier.calcularPuntos();

        System.out.println("\nRESULTADOS:");
        jugador.mostrarMano();
        crupier.mostrarMano();

        if (totalCrupier > 21 || totalJugador > totalCrupier) {
            System.out.println("¡Has ganado! +" + apuesta + "€");
            jugador.fondos += apuesta;
            victoriasJugador++;
        } 
        else if (totalJugador < totalCrupier) {
            System.out.println("Has perdido. -" + apuesta + "€");
            jugador.fondos -= apuesta;
            victoriasCrupier++;
        } 
        else {
            System.out.println("Empate. Recuperas tu apuesta.");
        }
    }
}

