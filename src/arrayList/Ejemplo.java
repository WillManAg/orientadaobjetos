package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();

		
		numeros.add(55);
		numeros.add(33);
		// la primera opción es la posición donde va a ingresar
		numeros.add(0,22);
		
		// obtiene el de la posición 0
		System.out.println(numeros.get(0));
		
		// obtiene y saca el tamaño total -1 osea va a la última posición
		System.out.println(numeros.get(numeros.size()-1));
		
		// mtipico mostrar datos del array
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		// esto hace lo mismo que lo de arriba, recorre todo numeros y lo almacena en i, despues imprime lo que hay en i
		for (Integer i: numeros) {
			System.out.println(i);
		}
		
		// solo tiene 3 metrodos, next, hasnext y remove
		
		System.out.println("ITERATOR A CONTINAUCIÓN");
		Iterator<Integer> it = numeros.iterator(); // crea un iterador del arrayList que tenemos
		while(it.hasNext()) {                      // empieza antes del primero osea en una posición inexistente -1, asique el primer next hace referencia al posición 0
			System.out.println(it.next());         // nos imprime el que está después del actual
		}
		
	}

}
