package arrays;

public class UtilidadesArrays {
	
	// saca el número de mayor valor dentro del array

	public static int mayorValor(int[] numeros) {

		int mayor = numeros[0];

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}

		return mayor;
	}
	
	// busca un valor determinado dentro de un array con una busqueda secuencial

	public static boolean buscarValor(int[] numeros, int valor) {
		
		for(int i = 0; i < numeros.length; i++) {
			
			if(numeros[i] == valor) {
				return true;
			}
			
		}
		return false;
		
	}
	
	// copiar un array
	
	public static int [] copiarArray(int [] numeros) {
		// creamos una nueva array null sin valores
		int [] copia = null;
		
		// entramos si el array que recibimos no es nula, así cambiamos el valor de copia
		if (numeros != null) {
			
			copia = new int[numeros.length];
			for(int i=0; i < numeros.length; i++) {
				copia[i] = numeros[i];
			}
			
			return copia;
			
			
		}
       // devuelve nulo porque no hemos entrado
		return copia;
	}
	
	public static int suma(int[] numeros) {
		
		int suma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			// le suma el número que está en la posición i
			suma+=numeros[i];
			
		}
		
		return suma;
	}
	
	// Suma el número de caracteres que tiene cada cadena de texto del array
	public static int caracteresTotales(String[] cadenas) {

		int numeroCaracteres = 0;
		// comprueba que la cadena en si no sea nula
		if (cadenas != null) {

			for (int i = 0; i < cadenas.length; i++) {
				// comprueba que la cadena que está en la posición i no sea nula
				if (cadenas[i] != null) {

					numeroCaracteres += cadenas[i].length();

				}

			}

			return numeroCaracteres;

		}
		return -1;
	}

	// Metodo que busca las cadenas que empiecen por A

	public static int cuantasEmpiezanPorA(String[] cadenas) {

		int numeroA = 0;

		if (cadenas != null) {

			for (int i = 0; i < cadenas.length; i++) {
				// también se puede usar startswith con "A"
				if (cadenas[i].charAt(0) == 'A') {

					numeroA++;

				}

			}
		}

		return numeroA;
	}
	
	// Método que cifre un array y cree otro array cifrado
	
	public static String[] cifrarArray(String[] cadenas) {
		
		String[] cifrado; 
		cifrado = new String[cadenas.length];
		
		for (int i = 0; i < cadenas.length; i++) {
			
			cifrado[i] = Cesar.codificar(cadenas[i]);
			
		}
		
		return cifrado;
		
	}
	
	// Se queda con la cadena que más caracteres tiene
	
	public static String cadenaMayor(String[] cadenas) {
		
		String mayor = cadenas[0];
		// empezamos en 1 porque el 0 ya lo tengo almacenado
		for (int i = 1; i < cadenas.length; i++) {
			
			if (cadenas[i].length() > mayor.length()) {
				mayor = cadenas[i];
			}
			
		}
		
		return mayor;
		
	}

}
