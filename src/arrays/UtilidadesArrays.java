package arrays;

public class UtilidadesArrays {

	public static int mayorValor(int[] numeros) {

		int mayor = numeros[0];

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}

		return mayor;
	}

}
