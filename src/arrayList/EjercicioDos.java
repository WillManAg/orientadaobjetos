package arrayList;

import java.util.ArrayList;

public class EjercicioDos {

	public static void main(String[] args) {

		ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> nombresOtro = new ArrayList<>();

        nombres.add("Maria");   
        nombres.add("Felipe");  
        nombres.add("Ernesto");
        
        int total = nombres.size();

        for(int i = 0; i < total; i++) {

            int posicion = (total -1) - i;

            String nombre = nombres.get(posicion);
            nombresOtro.add(nombre);
        }

        for (int i = 0; i < nombresOtro.size(); i++) {
            System.out.println(nombresOtro.get(i));
        }

	}

}
