package agenda;

public class Agenda {

	private Contacto[] contactos;

	// Así decidimos desde fuera cuántos contactos máximos habrá en la agenda
	public Agenda(int cantidadContactos) {

		contactos = new Contacto[cantidadContactos];

	}

	// creamos el menu para llamarlo luego cuando lo necesitemos
	public static void mostrarMenu() {
		System.out.println("\n--- MENU AGENDA ---");
		System.out.println("1. Añadir contacto");
		System.out.println("2. Editar contacto");
		System.out.println("3. Borrar contacto");
		System.out.println("4. Buscar contacto x iniciales");
		System.out.println("5. Mostrar agenda");
		System.out.println("0. Salir");
	}

	// añadimos contactos a la agenda si el hueco está vacio

	public boolean añadirContacto(Contacto nuevoContacto) {

		// Verificamos que el nuevo contacto no es nulo
		if (nuevoContacto != null) {

			// miramos todo el array de contactos
			for (int i = 0; i < contactos.length; i++) {

				// entramos si encuentra un hueco, osea que la posición revisada es nula(vacia)
				if (contactos[i] == null) {

					// almacenamos el nuevo contacto ahí y devolvemos true (almacenado)
					contactos[i] = nuevoContacto;
					return true;
				}

			}

		}
		return false;
	}

	// buscamos el contacto que nos pasan, si existe ene l array por la id
	public int buscarContacto(Contacto contacto) {

		// revisa que el contacto que nos llega para buscar no sea nulo
		if (contacto != null) {

			for (int i = 0; i < contactos.length; i++) {
				// mira en el array un contacto que no sea nulo
				if (contactos[i] != null) {
					// lo compara por id con el contacto que hemos recibido
					if (contactos[i].mismoContacto(contacto)) {
						// si coincide devuelve la posición en el array en la que se encuentra el
						// contacto
						return i;
					}

				}

			}

		}

		return -1;
	}

	// buscar contacto por id
	public int buscarIndicePorId(int id) {
		for (int i = 0; i < contactos.length; i++) {
			// miramos la id de todos los contactos que no sean null y si la id es igual que la recibida, devolvemos la posición en el array en la que se encuentra el contacto con esa id
			if (contactos[i] != null && contactos[i].getId() == id) {
				return i;
			}
		}
		return -1;
	}

	// borrar contacto
	public boolean borrarContacto(Contacto contacto) {

		// como buscar contacto devuelve un número entero, buscamos el contacto que nos
		// pasan con el método y almacenamos la respuesta
		int posicion = this.buscarContacto(contacto);
		// si no encuentra el contacto va a devolver -1 así que nos aseguramos que sí
		// encontró el contacto
		if (posicion != -1) {
			// va a la posición que nos devolvió y la volvemos null
			contactos[posicion] = null;
			// devolvemos true para informar que ya ha sido borrado correctamente
			return true;

		}
		// en caso de que recibiera -1 osea, no encontró el contacto, devolvemos false
		return false;
	}

	public void buscarPorNombre(String prefijo) {
		
		// creamos un boolean en falso para imprimir que no se ha encontrado un contacto en caso de que no se encuentre
		boolean encontrado = false;
		
		// recorremos todo el array de contactos
		for (int i = 0; i < contactos.length; i++) {
			// miramos si el contacto no es nulo y si coincide por nombre con el prefijo que nos dieron
			if (contactos[i] != null && contactos[i].mismoContactoNombre(prefijo)) {
				// imprimimos el contacto que coincide
				System.out.println("Este contacto coincide con tu busqueda: ");
				contactos[i].mostrarContacto();
				encontrado = true;
			}
		}
		
		// si no se encontró ningún contacto, obtendrá esta respuesta
		if (!encontrado) {
			System.out.println("No existe ningún contacto que empiece por: " + prefijo);
		}
		
	}

	// mostramos todos los contactos que hay guardados en el array de la agenda
	public void mostrarAgenda() {
		
		// creamos boolean para imprimir en caso de que no encuentre nada
		boolean vacia = true;

		for (int i = 0; i < contactos.length; i++) {
			// si no es null mostramos los datos que hemos elegido imprimir en el método
			// mostrarContacto
			if (contactos[i] != null) {
				System.out.println("--------------------------------");
				contactos[i].mostrarContacto();
				vacia = false;

			}

		}
		
		// Si la agenda no tiene contactos, devolverá este contacto
		if (vacia) {
			System.out.println("La agenda está vacía");
		}
	}
	
	// método que localiza el contacto por id y DEVUELVE EL CONTACTO para editarlo
	public Contacto getContactoEnIndice(int id) {
		
		// Si el id que buscamos está entre 1 y la longitud de la agenda, devolvemos el contacto que está en la id que buscabamos
        if (id >= 1 && id < contactos.length) {
            return contactos[id];
        }
        
        return null;
    }

}
