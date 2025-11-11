package basico;

import java.time.LocalDate;
import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/*
		 * Usuario usu1 = new Usuario(); int tecla = 0, userSalario; String userNombre;
		 * double userNomina;
		 */
		Usuario usuario1 = null;
		Autor autor1 = new Autor(1, "Ernesto", "Hernandez", "Española");
		Libro libro1 = new Libro(1, "Hola", autor1, 1993);

		int opcion;
		String nombre;
		Double saldo;

		/*
		 * while (tecla != 4) { // Menu System.out.println("Selecciona una opción: ");
		 * System.out.println("1. Crear usuario");
		 * System.out.println("2. Mostrar Datos");
		 * System.out.println("3. Modificar el salario");
		 * System.out.println("4. Salir");
		 * 
		 * tecla = teclado.nextInt(); if (tecla < 1 || tecla > 4) {
		 * System.out.println("Este número no está dentro del menú."); } else if (tecla
		 * == 1) { System.out.println("Bienvenido al menú de creación de usuario");
		 * System.out.println("Primero introduce el nombre del usuario:"); userNombre =
		 * teclado.next(); usu1.setNombre(userNombre);
		 * System.out.println("Ahora introduce el salario de la persona:"); userSalario
		 * = teclado.nextInt(); usu1.setNomina(userSalario); } else if (tecla == 2) {
		 * usu1.mostrarDatos(); } else if (tecla == 3) {
		 * System.out.println("Vamos a modificar el salario: ");
		 * System.out.println("Indica cuánto es el porcentaje que quieres subir: ");
		 * userNomina = teclado.nextDouble(); usu1.incrementarSalario(userNomina, 1, 2);
		 * System.out.println("El nuevo salario es: " + usu1.getNomina()); } else {
		 * System.out.println("¡hasta otra!"); tecla = 4; } }
		 */

		System.out.println("1. Crear usuario");
		System.out.println("2. Mostrar Datos");
		System.out.println("3. Modificar el salario");
		System.out.println("4. Salir");
		opcion = Integer.parseInt(teclado.nextLine());

		while (opcion != 4) {
			switch (opcion) {
			// con el parse Int lo pasa a valor entero.
			case 1:
				System.out.println("nombre");
				nombre = teclado.nextLine();
				System.out.println("saldo");
				saldo = Double.parseDouble(teclado.nextLine());
				Usuario usu1 = new Usuario("Roberto", 1600.00, libro1, libro1, "Arroz123", LocalDate.of(2025, 04, 27));
				break;
			case 2:
				if (usuario1 != null) {
					usuario1.mostrarDatos();
				} else {
					System.out.println("No hay usuario");
				}
				break;
			case 3:
				if (usuario1 != null) {
					System.out.println("Nuevo saldo");
					saldo = Double.parseDouble(teclado.nextLine());
					usuario1.setNomina(saldo);
				} else {
					System.out.println("No hay usuario");

				}

				break;
			case 4:
				break;
			}

			System.out.println("1. Crear usuario");
			System.out.println("2. Mostrar Datos");
			System.out.println("3. Modificar el salario");
			System.out.println("4. Salir");
			opcion = Integer.parseInt(teclado.nextLine());
		}

		teclado.close();
	}

}
