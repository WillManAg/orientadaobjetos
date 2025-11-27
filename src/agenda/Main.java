package agenda;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// creamos una agenda de tipo Agenda y reservamos memoria para 20 contactos
		Agenda miagenda = new Agenda(20);

		// Después de importar la fecha, se pone año-mes-día osea al revés
		miagenda.añadirContacto(
				new Contacto("William", "Marin", "686773719", "d3v.william@gmail.com", LocalDate.of(1993, 4, 14)));
		miagenda.añadirContacto(
				new Contacto("Miriam", "Chahdi", "654789321", "miriamchmangadi@gmail.com", LocalDate.of(2001, 9, 30)));

		// creamos nuestro break porque por lo visto poner un fuucking break es ilegal y
		// pecado capital
		boolean salir = false;

		while (!salir) {
			// Imprimimos el menu que hemos creado en la agenda para una primera vista
			Agenda.mostrarMenu();
			// declaramos la opción donde almacenaremos la elección del usuario y la leemos como texto (eliminamos posibles espacios antes y despues con el trim)
			String linea = teclado.nextLine().trim();
			// declaramos un int para la transformación
            int opcion;
            // controla la transformación, si la transformación no es posible lanzará un error
            try {
                opcion = Integer.parseInt(linea);
                // si no se realizó la transformación porque no era un número válido para int, lanzará un mensaje de que la opción no es válida
            } catch (NumberFormatException e) {
                System.out.println("Opción no válida. Introduce un número.");
                continue;
            }

			switch (opcion) {

			case 1: // Añadir contacto
				
				System.out.println("--- AÑADIR CONTACTO ---");
                System.out.print("Nombre: ");
                String nombre = teclado.nextLine().trim();
                System.out.print("Apellido: ");
                String apellido = teclado.nextLine().trim();
                System.out.print("Teléfono: ");
                String telefono = teclado.nextLine().trim();
                System.out.print("Email: ");
                String email = teclado.nextLine().trim();
                System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
                String fecha = teclado.nextLine().trim();
				
			case 2:

			case 3:

			case 4:

			case 5:

			case 6:

			}

		}
		
		teclado.close();
	}

}
