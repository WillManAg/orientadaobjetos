package arrays2d;

public class UtilidadesArrays2d {

	public static int valorMinimo(int[][] matriz) {
		int menor = matriz[0][0];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) { 
						
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
				}

			}

		}

		return menor;
	}
	
	// Mirar el número menor en una matriz 2d y crear un array menores con todos los menores de cada fila
	
	public static int[] menorCadaFila(int[][] matriz) {

		if (matriz != null) {

			int[] menores = new int[matriz.length];

			for (int i = 0; i < matriz.length; i++) {
				if (matriz[i] != null) {

					menores[i] = matriz[i][0];

					for (int j = 0; j < matriz[i].length; j++) {

						if (matriz[i][j] < menores[i]) {
							menores[i] = matriz[i][j];
						}
					}
				}
			}

			return menores;

		}
		return null;
	}
	
	// un metodo que comprueba si 2 arrays tienen las mismas dimensiones
	
	public static boolean mismasDimensiones(int[][] matrizUno, int[][] matrizDos) {

		// primero comprobamos si tiene el mismo número de filas
		if (matrizUno.length != matrizDos.length) {
			return false; // devuelve son distintas
		}
		
		for (int i = 1; i < matrizUno.length; i++) {
			// comprueba si es rectangular mirando cada fila y comparandola con la 0
			if (matrizUno[0].length != matrizUno[i].length) {
				return false;
			}
			
		}

		// ahora entramos a las columnas
		for (int i = 0; i < matrizUno.length; i++) {
			// revisa columna la longitud de la fila 0 y si no es la misma longitud que el
			// array 0 de la matriz 2 devuelve false
			if (matrizUno[i].length != matrizDos[i].length) {
				return false; // devuelve columnas distintas
			}
		}

		return true;
	}

	
	// Realizar un método que sume 2 matrices y devuelva el resultado
	
	public static int[][] sumaMatriz(int[][] matrizUno, int[][] matrizDos) {
		
		if(!mismasDimensiones(matrizUno, matrizDos)) { // la puedo llamar porque está en el mismo archivo
			return null;
		}
		
		int matrizSumada[][] = new int[matrizUno.length][matrizUno[0].length]; // la columna se mide mirando primero el numero de filas y luego la longitud de la fila 0 suponiendo que es cuadricular
		
		for (int i = 0; i < matrizUno.length; i++) {
			
			for (int j = 0; j < matrizUno[i].length; j++) {
				
				matrizSumada[i][j] = matrizUno[i][j] + matrizDos[i][j];
				
			}
			
		}
		
		return matrizSumada;
	}
	
	
}
