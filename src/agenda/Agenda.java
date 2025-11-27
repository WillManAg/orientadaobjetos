package agenda;

public class Agenda {

	private Contacto[] contactos;

	// Así decidimos desde fuera cuántos contactos máximos habrá en la agenda
	public Agenda(int cantidadContactos) {

		contactos = new Contacto[cantidadContactos];

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
						// si coincide devuelve la posición en el array en la que se encuentra el contacto
						return i;	
					}

				}

			}

		}

		return -1;
	}

	// borrar contacto
	public boolean borrarContacto(Contacto contacto) {
		
		// como buscar contacto devuelve un número entero, buscamos el contacto que nos pasan con el método y almacenamos la respuesta
		int posicion = this.buscarContacto(contacto);
		// si no encuentra el contacto va a devolver -1 así que nos aseguramos que sí encontró el contacto
		if (posicion != -1) {
			// va a la posición que nos devolvió y la volvemos null 
			contactos[posicion] = null;
			// devolvemos true para informar que ya ha sido borrado correctamente
			return true;
			
		}
		// en caso de que recibiera -1 osea, no encontró el contacto, devolvemos false
		return false;
	}
	
	
	
}
