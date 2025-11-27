package agenda;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

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
                String fechaStr = teclado.nextLine().trim();
                
                // creamos el usuario pero asegurandonos que sí o sí la fecha se introduce en el formato correcto, hasta que no lo haga bien, no crea el usuario
				try {
					// creamos una variable localdate y la igualamos a la transformación del string de fecha
					LocalDate fecha = LocalDate.parse(fechaStr);
					
					// creamos un objeto contacto con su propia id, pero todavía no lo añadimos al array de miagenda
					Contacto nuevoContacto = new Contacto(nombre, apellido, telefono, email, fecha);
					
					// intentamos añadir el contacto con el método a miagenda y como este devuelve un booleando de si se añadió o no, almacenamos la respuesta
					boolean añadido = miagenda.añadirContacto(nuevoContacto);
					
					if (añadido) {
						// hay que recordar que la id que quieres imprimir es la del nuevoContacto
						System.out.println("El contacto se ha añadido correctamente, con la id: " + nuevoContacto.getId());
					} else {
						// si falla después de toda comprobación de los métodos ante nulos, es porque la agenda ya se llenó
						System.out.println("No se ha podido añadir más contactos a tu agenda, el máximo es 20");
					}
					// la exception que lanza el intentar transformar una fecha en localDate, hay que importar su libreria
				} catch (DateTimeParseException e) {
					System.out.println("Formato de fecha incorrecto. Usa yyyy-mm-dd. Contacto no añadido.");
				}
				
				break;
				
			case 2: // Editar contacto
				
				System.out.println("--- EDITAR CONTACTO ---");
                System.out.print("Introduce el ID del contacto a editar: ");
                String idStr = teclado.nextLine().trim();
                
                try {
                	
                	// almacenamos el id que queremos editar, haciendo la comprobación de número introducido válido
                	int idEditar = Integer.parseInt(idStr);
                	
                	// almacenamos la posición en el array en la que se encuentra el usuario con esa id (puede devolver -1)
                	int indice = miagenda.buscarIndicePorId(idEditar);
                	
                	if (indice == -1) {
                		System.out.println("El contacto con id: " + idEditar + " no existe en la agenda.");
                	} else {
                		
                		// ahora que ya sabemos la posición en el indice donde está el contacto, obtenemos el contacto con el método de obtener contacto por indice y lo almacenamos porque devuelve un contacto
                		Contacto temporal = miagenda.getContactoEnIndice(indice);
                		
                		System.out.println("Contacto encontrado:");
                		temporal.mostrarContacto();
                		
                		System.out.println("Cambia el dato que quieras: (deja en blanco para mantener el que ya tiene).");
                		
                		// pedimos nombre, mostrando el actual
                		System.out.print("Nuevo nombre (" + temporal.getNombre() + "): ");
                		// almacenamos el nuevo nombre, como usamos el trim si deja un espacio o lo deja vacio, se quedará empty
                        String nuevoNombre = teclado.nextLine().trim();
                        // si el nuevoNombre no tiene un valor vacio, se establecerá nuevoNombre como nuevo nomber de temporal
                        if (!nuevoNombre.isEmpty()) {
                        	temporal.setNombre(nuevoNombre);
                        }

                        System.out.print("Nuevo apellido (" + temporal.getApellido() + "): ");
                        String nuevoApellido = teclado.nextLine().trim();
                        if (!nuevoApellido.isEmpty()) {
                        	temporal.setApellido(nuevoApellido);
                        }

                        System.out.print("Nuevo teléfono (" + temporal.getTelefono() + "): ");
                        String nuevoTelefono = teclado.nextLine().trim();
                        if (!nuevoTelefono.isEmpty()) {
                        	temporal.setTelefono(nuevoTelefono);
                        }

                        System.out.print("Nuevo email (" + temporal.getEmail() + "): ");
                        String nuevoEmail = teclado.nextLine().trim();
                        if (!nuevoEmail.isEmpty()) {
                        	temporal.setEmail(nuevoEmail);
                        }
                		
                        System.out.print("Nueva fecha de nacimiento (" + temporal.getFechaNacimiento() + ") [yyyy-MM-dd]: ");
                        String nuevaFecha = teclado.nextLine().trim();
                        if (!nuevaFecha.isEmpty()) {
                            try {
                                LocalDate fechaTemp = LocalDate.parse(nuevaFecha);
                                temporal.setFechaNacimiento(fechaTemp);
                            } catch (DateTimeParseException e) {
                                System.out.println("Formato de fecha incorrecto. Fecha no cambiada.");
                            }
                        }

                        System.out.println("Contacto actualizado:");
                        temporal.mostrarContacto();
                    }
                } catch (NumberFormatException e) {
                    System.out.println("ID no válido.");
                }
                break;
                
			case 3:

			case 4:

			case 5:

			case 6:

			}

		}
		
		teclado.close();
	}

}
