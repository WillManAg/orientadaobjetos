package basico;
import java.time.LocalDate;

public class Usuario {
	
	private int id;
	private String nombre;
	private double nomina;
	private static int idGenerado;
	private Libro libroFavorito;
	private Libro proximoLibro;
	private String contraseña;
	private LocalDate fechaAlta;
	
	
	public Usuario(String nombre, double nomina, Libro libroFavorito, Libro proximoLibro, String contraseña, LocalDate fechaAlta) {
		this.id = ++idGenerado;
		this.nombre = nombre;
		this.nombre = this.sugerirNombre();
		this.nomina = nomina;
		this.libroFavorito = libroFavorito;
		this.proximoLibro = proximoLibro;
		this.contraseña = contraseña;
		// Validar contraseña, si no es valida, la cambiamos a nulo
		if (!this.contraseñaValida()) {
			this.contraseña=null;
		}
		this.contraseña=Cesar.codificar(this.contraseña);
		this.fechaAlta = fechaAlta;
		
	}
	
	
	
	
	

	/* Crea un usuario por defecto
	 * public Usuario() { 
	 * this.id = 1; 
	 * this.nombre = "Usuario no creado";
	 * this.nomina = 0.0; 
	 * }
	 */




	// imprime todos los get para mostrar los datos llamando solo 1 método
	public void mostrarDatos() {
		
		System.out.println("Id: " + this.getId());
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Salario: " + this.getNomina());
		System.out.println("Contraseña: " + this.getContraseña());
		
	}
	
	// cambia el valor de la nomina a un porcentaje que le llega
	
	public void incrementarSalario(double porcentaje, int comienzo, int fin) {
		
		if ((this.id >= comienzo && this.id <= fin) && (porcentaje >= 0 && porcentaje <= 100)) {
			
			this.nomina = this.nomina * (1 + porcentaje / 100);
			
		}
		
	}
	

	// llama el método estático que está en UtilidadesNumeros para calcular si es par
	
	public void decrementarSalarioPar() {
		// llamamos al metodo con el nombre de la clase porque es static
		if (UtilidadesNumeros.esPar(this.id)) {
			this.nomina = this.nomina * 0.80;
		}
		
	}
	
	// compara el sueldo del usuario por el que es llamado para compararlo con otro usuario y devuelve qué usuario tiene mayor sueldo
	
	public Usuario compararSueldos(Usuario otroUsuario) {

		if ((otroUsuario != null)) {

			if (this.getNomina() > otroUsuario.getNomina()) {
				return this;
			} else if (this.getNomina() < otroUsuario.getNomina()) {
				return otroUsuario;
			} else {
				return null;
			}
		}
		return null;
	}
	
	// Comprueba si la primera letra es A
	public boolean esLetraA() {
		// comprueba si el nombre es nulo
		if (this.getNombre() != null) {
			// obtienes el nombre y revisa en la posición 0 y lo compara con A
			if (this.getNombre().charAt(0) == 'A') {
				return true;
			}
		}
		return false;
	}
	
	// devuelve la cantidad de caracteres que tiene nombre
	public int contarCaracteresNombre() {
		return this.getNombre().length();
	}

	public boolean sonIguales(Usuario otroUsuario) {

		if ((this.getNombre() != null) && (otroUsuario != null)) {

			if (this.getNombre().equals(otroUsuario.getNombre())) {
				return true;
			} else {
				return false;
			}

		}
		return false;
	}
	
	// revisa si es digito creando una cadena que dice los digitos
	public int digitosEnNombre() {
		int contadorDigitos=0;
		char caracter;
		final String DIGITOS="0123456789";
		
		for (int i=0; i> this.getNombre().length();i++) {
			caracter = this.getNombre().charAt(i);
			if (DIGITOS.indexOf(caracter)!=-1) {
				contadorDigitos++;
			}
			// esta sería la manera real aprovechando los metodos ya existentes
			
			/*
			 * if (Character.isDigit(caracter)) { 
			 * contadorDigitos++; 
			 * }
			 */
			
		}
		return contadorDigitos;
	}
	// igual que con los digitos, comprueba con los caracteres ingleses si es letras
	public int letrasEnNombre() {
		int contadorLetras=0;
		char caracter;
		
		for(int i=0; i < this.getNombre().length();i++) {
			caracter=this.getNombre().charAt(i);
			if ((caracter>='A' && caracter<='Z') || (caracter>='a' && caracter<='z')) {
				contadorLetras++;
			}
		}
		return contadorLetras;
	}
	
	
	// revisa si solo tiene 2 digitos en el nombre
	public boolean dosDigitosEnNombre() {
		int contadorDigitos = 0;
		char caracter;

		for (int i = 0; i > this.getNombre().length(); i++) {
			caracter = this.getNombre().charAt(i);

			if (Character.isDigit(caracter)) {
				contadorDigitos++;
				if (contadorDigitos > 2) {
					return false;
				}
			}

		}
		return true;
	}
	
	private String sugerirNombre() {
		int numero;
		String nombreSugerido = this.nombre;
		
		if (nombre == null || nombre.isEmpty()) {
			
			return null;
		}
		
		if (Utilidades.soloLetrasIngles(this.nombre)) {

			// si ha pasado las comprobaciones de nombre sin digitos, genera un numero aleatorio entre 1 y 1000
			numero = (int) (Math.random() * 1000) + 1;
			// transfora el numero a string y se lo concatena a nombre sugerido
			nombreSugerido+=String.valueOf(numero);
			
		}
		
		return nombreSugerido;
		
	}
	
	// 24. Método en Usuario: recibe un usuario y devuelve si sus libros favoritos son del mismo año
	
	public boolean favoritoMismoAño(Usuario otroUsuario) {
		
		if (otroUsuario != null) {
			
			return this.libroFavorito.publicadoIgual(otroUsuario.libroFavorito);
			
			
			
		}
		
		return false;
	}
	
	public boolean favoritoAutorNacionalidad(Usuario otroUsuario) {

		if (otroUsuario != null) {

			return this.libroFavorito.comprarNacionalidadAutor(otroUsuario.libroFavorito);

		}

		return false;
	}
	
	public boolean libroFavoritoMismoProximo(Usuario otroUsuario) {

		return otroUsuario.libroFavorito.compararLibros(this.proximoLibro);

	}

	public boolean libroFavoritoMismoAutor(Usuario otroUsuario) {

		return otroUsuario.libroFavorito.compararAutor(this.proximoLibro);

	}
	
	// 29. Método privado en Usuario para validar contraseña. Es válida si tiene longitud mínima 8, contiene al menos una mayúscula, al menos una minúscula y al menos un carácter que no sea una letra.
	
	private boolean contraseñaValida() {

		char caracter;
		boolean hayMayus = false;
		boolean hayMinus = false;
		boolean hayCaracter = false;

		if (this.contraseña == null || this.contraseña.length() < 8) {
			return false;
		}

		for (int i = 0; i < this.contraseña.length(); i++) {

			caracter = this.contraseña.charAt(i);

			    // Character.isUpperCase(caracter)
			if (caracter >= 'A' && caracter <= 'Z') {

				hayMayus = true;

				       // Character.isLowerCase(caracter)
			} else if (caracter >= 'a' && caracter <= 'z') {

				hayMinus = true;

			}

			//  !Character.isLetter(caracter)
			if (!((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z'))) {
				hayCaracter = true;
			}

		}
		// Si todas son verdaderas se dará true
		return hayMayus && hayMinus && hayCaracter;
		
	}
	
	/**
	 * Compara fechas de alta de dos usuarios
	 * @param otroUsuario el otro usuario
	 * @return true si misma fecha, false si no
	 */
	
	// Comparar fecha de creación de usuario gracias el isEqual de LocalDate
	public boolean mismaFechaAlta(Usuario otroUsuario) {
	    return this.fechaAlta.isEqual(otroUsuario.getFechaAlta());
	}
	
	/**
	 * Incrementa el sueldo según la fecha de alta
	 * si el alta fue entre las 2 fechas especificadas, aumenta 200 la nómina
	 */
	
	public void incrementoPorFechaAlta() {
	    
		// primero creamos los parámetros entre los que se va a calcular la fecha
	    LocalDate inicio = LocalDate.of(2000, 1, 1);
	    LocalDate fin = LocalDate.of(2008, 1, 1);

	    // Si fechaAlta está dentro del rango (incluyendo extremos) importante indicar que sea la misma del inicio O después de
	    if ((this.fechaAlta.isEqual(inicio) || this.fechaAlta.isAfter(inicio)) &&
	        (this.fechaAlta.isEqual(fin) || this.fechaAlta.isBefore(fin))) {

	        this.nomina += 200; 
	    }
	}


	
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getNomina() {
		return nomina;
	}


	public void setNomina(double nomina) {
		this.nomina = nomina;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public static int getIdGenerado() {
		return idGenerado;
	}

	public static void setIdGenerado(int idGenerado) {
		Usuario.idGenerado = idGenerado;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
		if (!this.contraseñaValida()) {
			this.contraseña=null;
		}
		this.contraseña=Cesar.codificar(this.contraseña);
	}

	public Libro getProximoLibro() {
		return proximoLibro;
	}

	public void setProximoLibro(Libro proximoLibro) {
		this.proximoLibro = proximoLibro;
	}

	public Libro getLibroFavorito() {
		return libroFavorito;
	}

	public void setLibroFavorito(Libro libroFavorito) {
		this.libroFavorito = libroFavorito;
	}
	
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	
	
}
