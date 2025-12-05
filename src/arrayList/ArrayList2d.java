package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2d {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
        final int numAlumnos = 10;  
        int i, j, nota, cont = 1;

        ArrayList<ArrayList<Integer>> array = new ArrayList<>();                                        

        System.out.println("Introduzca notas. < 0 para acabar");
        for(i=0;i < numAlumnos;i++){
            cont = 1;
            System.out.println("Alumno " + (i+1) + ": ");
            System.out.print("Nota " + cont + ": ");
            nota = teclado.nextInt();

            array.add(new ArrayList<Integer>());

            while(nota >= 0){
                array.get(i).add(nota); 
                cont++;
                System.out.print("Nota " + cont + ": ");
                nota = teclado.nextInt();             
            }           
        }

        System.out.println("Notas de alumnos");
        for(i=0;i < array.size();i++){                       
            System.out.print("Alumno " + i + ": ");
            for(j=0;j < array.get(i).size();j++){                    
                System.out.print(array.get(i).get(j) + " "); 
            }
            System.out.println();          
        }
        
        teclado.close(); 
	}
}
