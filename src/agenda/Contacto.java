package agenda;
import java.time.LocalDate;

public class Contacto {

	// Variable estática para ir contando cada agendado
	private static int idGenerado;
	private int id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private LocalDate fechaNacimiento;
	
	
	public Contacto(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
		
		this.id = idGenerado++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	} 
	
	
	// mostramos todos los datos del contacto
	public void mostrarContacto() {
		
		System.out.println("CONTACTO AGENDADO CON ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("Email: " + this.email);
		System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
		
	}
	
	// comparamos si un contacto tiene la misma id que el otro y devolvemos true o false
	public boolean mismoContacto(Contacto otroContacto) {
		// primero comprobamos si el contacto que nos pasa no es null
		if (otroContacto == null) {
			return false;
		}
		// devuelve si coincide la id
		return this.id == otroContacto.id;
	}
	
	public boolean mismoContactoNombre(String prefijo) {
		
		// Nos aseguramos que el prefijo que nos pasan no es nulo, esté vacio o que el nombre con el que se compare no sea null.
		if (prefijo == null || prefijo.isEmpty() || this.nombre == null) {
            return false;
        }
		
		// dado que no controlamos el largo del prefijo que introduce el usuario, vamos a asegurarnos que no sea más largo que el propio nombre
		if (prefijo.length() > this.nombre.length()) {
            return false;
        }

		// miramos todo el array pero hasta la posición del prefijo que nos dan
		    for (int i = 0; i < prefijo.length(); i++) {
		    	// transformamos a minuscula y cogemos el caracter del nombre, en la misma posición que el caracter del prefijo obtenido
		        if (Character.toLowerCase(this.nombre.charAt(i)) != Character.toLowerCase(prefijo.charAt(i))) {
		            return false;
		        }
		    }

		    return true;
		
	}

	public int getId() {
        return this.id;
    }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
