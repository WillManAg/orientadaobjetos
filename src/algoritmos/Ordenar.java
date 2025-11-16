package algoritmos;

public class Ordenar {

	public int[] menorAMayor(int[] numeros) {

		for (int i = 0; i < numeros.length - 1; i++) {

			int menor = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[menor]) {

					menor = j;

				}

			}

			if (menor != i) {
				int temporal = numeros[i];
				numeros[i] = numeros[menor];
				numeros[menor] = temporal;
			}

		}
		return numeros;

	}

}
