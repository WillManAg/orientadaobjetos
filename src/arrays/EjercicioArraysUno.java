package arrays;

import java.util.Scanner;

public class EjercicioArraysUno {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int maximo = 10;
		int aux;

		// primero el tipo, luego lo almacenado y por último el nombre del array
		int[] numeros;

		// aquí reservamos la memoria de cuántos objetos va a manejar como máximo el
		// array
		numeros = new int[10];

		
		// pedir por teclado 10 valores y almacenar esos 10 valores en el array
		
		for (int i = 0; i < maximo; i++) {

			System.out.println("Introduce un número");

			numeros[i] = teclado.nextInt();
			
			// el profe le guta leer como linea
			
			// numero[i] = Integer.parseint(teclado.nextLine);

		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Numeros: " + numeros[i]);

		}
		
		// intercambiar el primero por el último
		
		// almaceno el 0 aparte para no perderlo
		aux=numeros[0];
		// sustituyo el 0 por el último
		numeros[0]=numeros[numeros.length-1];
		//le doy al último el valor de 0 que tenía ya almacenado previamente
		numeros[numeros.length-1]=aux;
		
		// sacar por pantalla cuántos valores positivos y cuántos negativos hay en el array
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] < 0) { 
				 contadorNegativo++; 
				 } else {
					 contadorPositivo++;
				 }
			
		}
		
		System.out.println("El numero de valores positivo es: " + contadorPositivo + " y de negativos " + + contadorNegativo);
		

		teclado.close();
	}
	

}
