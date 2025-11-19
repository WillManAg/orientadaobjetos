package arrays2d;

import java.util.Scanner;

public class EjemploArrays2D {
	
	public static void main(String[] args) {
		
		int[][] tablero;
		int numeroMenor;
		
		Scanner teclado = new Scanner(System.in);
		
		// Así declaro 3 filas pero sin numero de columnas predeterminado por fila
		// tablero = new int [3][];
		
		// Con esto le decimos que la primera fila tendrá 4 columnas
		// tablero[0] = new int [4];
		// tablero[1] = new int [6];
		// tablero[2] = new int [8];
		
		// Así declaramos un array 2D con las filas y columnas definidas
		tablero = new int [3][4];
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero[i].length; j++) { // el tablero i ayuda a mirar la longitud del array en concreto de esa fila
				
				System.out.println("Dato: ");
				tablero[i][j] = Integer.parseInt(teclado.nextLine());
				
			}
			
		}

		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) { 
				System.out.print(tablero[i][j] + " ");

			}

			System.out.println();
			
		}
		
		numeroMenor = UtilidadesArrays2d.valorMinimo(tablero);
				
	}

}
