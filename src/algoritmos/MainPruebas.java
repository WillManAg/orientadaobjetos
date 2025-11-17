package algoritmos;

import java.util.Arrays;

public class MainPruebas {

	public static void main(String[] args) {
		
		int [] numeros = {2,4,5,7,1,3,9,8,6};
		
		System.out.println("Array original: " );
		
		System.out.println(Arrays.toString(numeros));
		
		Ordenar ordenar = new Ordenar();
		
		int [] numerosOrdenados = ordenar.menorAMayor(numeros);
		
		System.out.println("Array ordenado: ");
		
		System.out.println(Arrays.toString(numerosOrdenados));
		
		
	}

}
