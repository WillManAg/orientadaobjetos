package basket;

public class Equipo {

	private Jugador[] jugadores;
	
	// Este método sirve para decidir cuánta memoria va a reservar, osea cuántos jugadores tendremos
	public Equipo(int cantidadJugadores) {
		
		jugadores = new Jugador[cantidadJugadores];
		
	}
	
	// Es un boolean porque tenemos que saber si se ha añadido el jugador o no
	public boolean añadirJugador(Jugador nuevoJugador) {
		
		for(int i = 0; i < jugadores.length; i++) {
			// revisa si en el array hay algún hueco
			if (jugadores[i] == null) {
				
				jugadores[i] = nuevoJugador;
				return true;
				
			}
			
		}
		return false;
	}
	
	public boolean eliminarJugador(Jugador jugador) {

		for (int i = 0; i < jugadores.length; i++) {

			if (jugadores[i] != null) {
				if (jugadores[i].mismoJugador(jugador)) {
					jugadores[i] = null;
					return true;
				}
			}

		}

		return false;

	}
	
	
	public void mostrarEquipo() {

		for (int i = 0; i < jugadores.length; i++) {

			if (jugadores[i] != null) {
				System.out.println("Jugador " + i);
				jugadores[i].mostrarJugador();

			}
		}

	}
	
}
