package basket;

public class Main {

	public static void main(String[] args) {
		
		Jugador jugador1, jugador2;
		int contador2 = 0;
		int contadorCanastas = 0;
		
		jugador1 = new Jugador();
		jugador2 = new Jugador("MJ",2.07, 50, 50);
	
		System.out.println("Jugador 1: De dos " + jugador1.getPorcentajeDos());
		System.out.println("Jugador 1: De tres " + jugador1.getPorcentajeTres());
		
		System.out.println("Jugador 2: De dos " + jugador2.getPorcentajeDos());
		System.out.println("Jugador 2: De tres " + jugador2.getPorcentajeTres());
		
		jugador1.entrenarDos(10);
		jugador2.entrenarDos(10);
		
		jugador1.entrenarTres(5);
		jugador2.entrenarTres(5);
		
		System.out.println("Jugador 1: De dos " + jugador1.getPorcentajeDos());
		System.out.println("Jugador 1: De tres " + jugador1.getPorcentajeTres());
		
		System.out.println("Jugador 2: De dos " + jugador2.getPorcentajeDos());
		System.out.println("Jugador 2: De tres " + jugador2.getPorcentajeTres());
		
		while (jugador1.getPorcentajeDos()<65) {
			jugador1.entrenarDos();
			contador2++;
		}
		System.out.println("Ha entrenado " + contador2 + " veces para llegar al 65%");
	
		while (contadorCanastas < 10) {
			jugador1.lanzarDeDos();
			
			if (jugador1.lanzarDeDos()) {
			contadorCanastas++;
			}
		}
		
		System.out.println("Has conseguido 10 canastas");	
	}

}
