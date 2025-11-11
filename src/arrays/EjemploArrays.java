package arrays;

public class EjemploArrays {

	public static void main(String[] args) {
		
		// primero el tipo, luego lo almacenado y por último el nombre del array
		int[] numeros;
		
		// aquí reservamos la memoria de cuántos objetos va a manejar como máximo el array
		numeros = new int[10];
		
		/*
		 * Para crear, reservar memoria y asignar valor al mismo tiempo
		 * int [] numeros= {1,2,3,4,5,6,7};
		 */
		
		// Así le damos un valor a una posición exacta en el array, usando el índice entre los []
		numeros[3] = 78;
		numeros[7] = 90;
		
		System.out.println("En la posicion 3: " + numeros[3]);
		
		numeros[3]++;
		
		System.out.println("En la posicion 3 ahora: " + numeros[3]);
		
		if (numeros[7] > numeros[3]) {
			System.out.println("El numero " + numeros[7] + " es mayor que el número " + numeros[3]);
		} else {
			System.out.println("El numero " + numeros[7] + " es menor que el número " + numeros[3]);
		}
		
		// muestra los valores del array
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.println("Numeros: " + numeros[i]);
			
		}
		
		// este for hace lo mismo que el de arriba, está predeterminado porque se hace mucho. Solo si se quiere procesar por completo, de principio a fin
		for (int numero:numeros) {
			System.out.println(numero);
		}
		
		
		
	}

}
