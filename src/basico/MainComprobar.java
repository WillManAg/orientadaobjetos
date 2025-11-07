package basico;

import java.time.LocalDate;

public class MainComprobar {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor(1, "Ernesto", "Hernandez", "Española");
		Autor autor2 = new Autor(2, "Nacho", "Miguel", "Española");
		
		Libro libro1 = new Libro(1, "Hola", autor1, 1993);
		Libro libro2 = new Libro(2, "Adios", autor2, 1993);
		
		//                                                                                 esto lee los datos de la fecha en modo numérico 
		Usuario usu1 = new Usuario("Roberto", 1600.00, libro1, libro1, "Arroz123", LocalDate.of(2025, 04, 27));
		//                                                                                 con este los lee en modo texto
		Usuario usu2 = new Usuario("Liam", 400.00, libro2, libro2, "Arroz123", LocalDate.parse("2025-04-27"));
		
		
		usu1.mostrarDatos();
		usu2.mostrarDatos();
		
		// comprobamos que ambos usuarios se dieron de alta en la misma fecha llamando al método
		if (usu1.mismaFechaAlta(usu2)) {
            System.out.println("Se dieron de alta el mismo día");
        } else {
            System.out.println("Se dieron de alta en días diferentes");
        }
		

	}

}
