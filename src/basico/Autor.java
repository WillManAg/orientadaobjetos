package basico;

public class Autor {

	private int id;
	private String nombre, apellidos, nacionalidad;

	public Autor(int id, String nombre, String apellidos, String nacionalidad) {

		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
	}

	public void mostrarDatos() {

		System.out.println("ID: " + this.getId());
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Apellidos: " + this.getApellidos());
		System.out.println("Nacionalidad: " + this.getNacionalidad());

	}

	/**
	 * Revisa la id de los usuarios
	 * @param otroAutor el autor con el que lo compara
	 * @return devuelve true si son iguales, también compara si no es null
	 */
	
	public boolean compararAutor(Autor otroAutor) {

		if (otroAutor != null) {
			// devuelve verdadero si se da, falso si no se da
			return this.id == otroAutor.id;
		}
		return false;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
