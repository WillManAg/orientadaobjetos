package basico;

public class Usuario {
	
	private int id;
	private String nombre;
	private double nomina;
	
	
	public Usuario(int id, String nombre, double nomina) {
		this.id = id;
		this.nombre = nombre;
		this.nomina = nomina;
	}
	
	
	

	public Usuario() {
		this.id = 1;
	    this.nombre = "Usuario no creado";
	    this.nomina = 0.0;
	}




	// imprime todos los get para mostrar los datos llamando solo 1 método
	public void mostrarDatos() {
		
		System.out.println("Id: " + this.getId());
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Salario: " + this.getNomina());
		
	}
	
	// cambia el valor de la nomina a un porcentaje que le llega
	
	public void incrementarSalario(double porcentaje, int comienzo, int fin) {
		
		if ((this.id >= comienzo && this.id <= fin) && (porcentaje >= 0 && porcentaje <= 100)) {
			
			this.nomina = this.nomina * (1 + porcentaje / 100);
			
		}
		
	}
	
	public void decrementarSalarioPar() {
		
		if (this.id % 2== 0) {
			this.nomina = this.nomina * 0.80;
		}
		
	}
	
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
	
	

}
