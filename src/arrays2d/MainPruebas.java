package arrays2d;

public class MainPruebas {

	public static void main(String[] args) {


		        int[][] matriz1 = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        int[][] matriz2 = {
		            {10, 20, 30},
		            {40, 50, 60}
		        };

		        // Suma las matrices y como devuelve una matriz, la guardamos
		        int[][] suma = UtilidadesArrays2d.sumaMatriz(matriz1, matriz2);

		        // Mostrar resultado si no es null
		        if(suma != null) {
		          
		        	for (int i = 0; i < suma.length; i++) {
		        		for ( int j = 0; j < suma[i].length; j++) {
		        			System.out.print(suma[i][j]+" ");
		        		}
		        		System.out.println();
		        	}
		        	
		        } else {
		        	System.out.println("Parece que no se pudieron sumar los arrays");
		        }


		

	}

}
