package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {


		// Escribe un programa que lea números enteros y los guarde en un ArrayList hasta que se lea un 0 y muestra los números leídos, suma y su media.

		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int ingreso = -1;
		
		while (ingreso != 0) {
		
			System.out.println("Ingresa un numero, pon 0 para salir");
			ingreso = Integer.parseInt(teclado.nextLine());
			
			if (ingreso != 0) {
				numeros.add(ingreso);
			}
			
		}
		
		// muestra los numeros
		for (Integer i: numeros) {
			System.out.println(i);
		}
		
		int suma = 0;
		int contador = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			suma += i;
			contador++;
		}
		
		System.out.println(suma);
		
		int media = suma/contador;
		
		System.out.println("La media es: " + media);
		
		teclado.close();
	}

}
