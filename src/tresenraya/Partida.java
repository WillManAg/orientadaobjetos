package tresenraya;

public class Partida {

    private final Tablero tablero;
    private final Jugador jugador1;
    private final Jugador jugador2;

    public Partida(Jugador jugador1, Jugador jugador2) {
        this.tablero = new Tablero();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void jugar() {

    }

}
