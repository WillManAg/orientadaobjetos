package arrays;
// import java.util.Scanner;

public class PruebasArrays {

	public static void main(String[] args) {
		
		// Scanner teclado = new Scanner(System.in);
		
		
		int [] numeros= {1,2,3,4,5,6,7};
		String[] cadenas= {"Hola","Como","Estas","Amigo","Mio"};
		String[] cifrado;
		
		
		// busca si el numero 9 está dentro de numeros, llamando al metodo buscarValor y pasandole el nombre del array y el valor buscado
		System.out.println(UtilidadesArrays.buscarValor(numeros, 9));
		
		System.out.println(UtilidadesArrays.suma(numeros));
		
		System.out.println(UtilidadesArrays.caracteresTotales(cadenas));
		
		System.out.println(UtilidadesArrays.cuantasEmpiezanPorA(cadenas));
		
		// primero almaceno para luego imprimirlo
		cifrado = UtilidadesArrays.cifrarArray(cadenas);
		
		for(int i = 0; i < cifrado.length; i++) {
			// importante el [i] para que me devuelva la posicion de cada uno
			System.out.println("XXX: " + cifrado[i]);
			
		}

		
		
		
		

	}

}
