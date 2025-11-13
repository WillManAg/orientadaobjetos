package basket;

public class MainPruebas {

	public static void main(String[] args) {

		// primero declaramos el objeto
		Jugador jugador1, jugador2;
		Equipo miEquipo;
		
		// le damos valores al objeto
		jugador1 = new Jugador();
		jugador2 = new Jugador(2, "MJ",2.07, 50, 50);
		
		// este objeto solo nos pide el numero de jugadores
		miEquipo = new Equipo(12);
		
		// ejecutamos metodo de añadir pero como es booleano tenemos una respuesta de si se añadió o no
		
		if (miEquipo.añadirJugador(jugador2)) {
			System.out.println("Jugador añadido");
		} else {
			System.out.println("Jugador no añadido");
		}
		
		
		miEquipo.añadirJugador(jugador1);
		miEquipo.mostrarEquipo();

	}

}
