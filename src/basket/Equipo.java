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
	
	// elimina un jugador del array pero usa el método de buscar si el jugador existe!
	
	public boolean eliminarJugador(Jugador jugador) {

		int posicion;

		posicion = this.buscarJugador(jugador);

		if (posicion != -1) {
			this.jugadores[posicion] = null;
		}

		return false;

	}

	
	// mostrar el array del equipo siempre que no sean nulos
	public void mostrarEquipo() {

		for (int i = 0; i < jugadores.length; i++) {

			if (jugadores[i] != null) {
				System.out.println("Jugador " + i);
				jugadores[i].mostrarJugador();

			}
		}

	}
	
	public boolean sustituirEquipo(Jugador jugador1, Jugador jugador2) {
		
		int posicion;
		
		posicion = this.buscarJugador(jugador1);
		
		if (posicion != -1) {
			this.jugadores[posicion] = jugador2;
		}
		
		return false;
	}
	
	public int buscarJugador(Jugador jugador) {

		if (jugador != null) {

			for (int i = 0; i < this.jugadores.length; i++) {

				if (this.jugadores[i] != null) {

					if (this.jugadores[i].mismoJugador(jugador)) {
						return i;
					}
				}
			}

		}
		return -1;
	}
	
}
