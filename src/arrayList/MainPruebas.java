package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPruebas {

	public static void main(String[] args) {
		
		// hay que probarlo porque va, hay que saber usar el metodo de utilidades
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<String> cadenas = null;
		ArrayList<String> cadenasAlReves;
		String cadena;
		final int MAX = 5;
		
		for (int i = 0; i < MAX; i++) {
			System.out.println("Introduce un texto: ");
			cadena = teclado.nextLine();
			cadenas.add(cadena);
		}
		
		System.out.println(cadenas);
		cadenasAlReves = Utilidades.alReves(cadenas);
		System.out.println(cadenasAlReves);

		teclado.close();
	}

}
