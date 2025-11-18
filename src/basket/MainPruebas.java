package basket;

import java.util.Arrays;

public class MainPruebas {

	public static void main(String[] args) {

		// primero declaramos el objeto
		Jugador jugador1, jugador2;
		Equipo miEquipo;
		
		// le damos valores al objeto
		jugador1 = new Jugador();
		jugador2 = new Jugador(2, "MJ",2.07, 22, 50);
		jugador2 = new Jugador(3, "LM",1.02, 28, 56);
		jugador2 = new Jugador(4, "Coby",3.00, 99, 70);
		
		// este objeto solo nos pide el numero de jugadores
		miEquipo = new Equipo(4);
		
		// ejecutamos metodo de añadir pero como es booleano tenemos una respuesta de si se añadió o no
		
		if (miEquipo.añadirJugador(jugador2)) {
			System.out.println("Jugador añadido");
		} else {
			System.out.println("Jugador no añadido");
		}
		
		
		miEquipo.añadirJugador(jugador1);
		miEquipo.mostrarEquipo();
		
		miEquipo.sustituirEquipo(jugador1, jugador2);
		System.out.println("Nuevo equipo");
		
		miEquipo.mostrarEquipo();
		
		// System.out.println("Array ordenado: ");
		
		// Arrays.sort(miEquipo.getJugadores());
		
		Jugador mejorJugador = miEquipo.mejorPorcentajeDeDos();
		
		System.out.println("El mejor jugador en tiros de 2 es: " + mejorJugador.getNombre());

		

	}

}
