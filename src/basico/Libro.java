package basico;

public class Libro {

	private int id;
	private String titulo;
	// Así se llama a un objeto de otra clase
	private Autor autor;
	private int añoPublicacion;
	
	
	public Libro(int id, String titulo, Autor autor, int añoPublicacion) {

		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.añoPublicacion = añoPublicacion;
	}
	
	public void mostrarDatos() {

		System.out.println("Libro:");
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.titulo);
		System.out.println("Año de Publicación: " + this.añoPublicacion);
		// Así muestra los datos del autor que está en la otra clase
		this.autor.mostrarDatos();;

	}
	
	public boolean publicadoIgual(Libro otroLibro) {
		
		return this.añoPublicacion==otroLibro.añoPublicacion;
		
	}
	
	// Hacemos la misma comparacion que con comprarSueldo de usuario pero esta vez con numeros no con el objeto
	public int publicadoAntes(Libro otroLibro) {
		
		if ((otroLibro != null)) {

			if (this.añoPublicacion <  otroLibro.añoPublicacion) {
				return -1;
			} else if (this.añoPublicacion > otroLibro.añoPublicacion) {
				return 1;
			} else {
				return 0;
			}
		}
		return -2;
		
	}
	
	public int comprarCaracteres(Libro otroLibro) {

		if ((otroLibro != null)) {

			if (this.titulo.length() < otroLibro.titulo.length()) {
				return -1;
			} else if (this.titulo.length() > otroLibro.titulo.length()) {
				return 1;
			} else {
				return 0;
			}
		}
		return -2;

	}
	
	public boolean comprarAutor(Libro otroLibro) {
		
		if ((otroLibro != null)) {

			// if (this.autor.getId() == otroLibro.autor.getId()); El de abajo hace esto pero usa el metodo de comprarAutor en Autor
			return this.autor.compararAutor(otroLibro.autor);
		}
		return false;
		
	}
	
	public boolean comprarNacionalidadAutor(Libro otroLibro) {
		
		if ((otroLibro != null)) {

			// para comparar cadenas de texto tenemos que usar equals siempre que sea booleano
			return this.autor.getNacionalidad().equals(otroLibro.autor.getNacionalidad());

		}
		return false;
	}
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	
	
}
