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
}
