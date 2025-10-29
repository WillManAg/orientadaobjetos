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
	    this.nombre = "Sin nombre";
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
