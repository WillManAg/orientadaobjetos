package basico;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Autor autor1 = new Autor(1, "Ernesto", "Hernandez", "Española");
		Autor autor2 = new Autor(2, "Nacho", "Miguel", "Española");
		
		Libro libro1 = new Libro(1, "Hola", autor1, 1993);
		Libro libro2 = new Libro(2, "Adios", autor2, 1993);
		
		//                                                                                 esto lee los datos de la fecha en modo numérico 
		Usuario usu1 = new Usuario("Roberto", 1600.00, libro1, libro1, "Arroz123", LocalDate.of(2025, 04, 27));
		//                                                                                 con este los lee en modo texto
		Usuario usu2 = new Usuario("Liam", 400.00, libro2, libro2, "Arroz123", LocalDate.parse("2025-04-27"));

		
		// usu1 = new Usuario("William", 1600.00);
		// usu2 = new Usuario("Wilson", 400.00);
		// usu3 = new Usuario("Robert", 2400.00);
		
		System.out.println("Usu1");
		// imprime un mostrar datos, no necesita un pln
		usu1.mostrarDatos();

		
		System.out.println("Usu2");
		usu2.mostrarDatos();

		// System.out.println("Usu3");
		// usu3.mostrarDatos();

	
		System.out.println("Introduce subida, comienzo y fin:");
		usu1.incrementarSalario(100.00, 2, 10);
		usu2.incrementarSalario(100.00, 2, 10);
		
		usu1.mostrarDatos();
		usu2.mostrarDatos();
		
		
		
		
		
		
		
		
	}

}
