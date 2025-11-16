package algoritmos;

import java.util.Arrays;

public class MainPruebas {

	public static void main(String[] args) {
		
		int [] numeros = {1,2,3,4,5,6,7};
		
		System.out.println("Array original: " );
		
		System.out.println(Arrays.toString(numeros));
		
		Ordenar ordenar = new Ordenar();
		
		int [] numerosOrdenados = ordenar.menorAMayor(numeros);
		
		System.out.println("Array ordenado: ");
		
		System.out.println(Arrays.toString(numerosOrdenados));
		
		
	}

}
