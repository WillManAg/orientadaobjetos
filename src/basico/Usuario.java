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

	// imprime todos los get para mostrar los datos llamando solo 1 método
	public void mostrarDatos() {
		
		System.out.println("Id: " + this.getId());
		System.out.println("Nombre: " + this.getNombre());
		System.out.println("Salario: " + this.getNomina());
		
	}
	
	// cambia el valor de la nomina a un porcentaje que le llega
	public void incrementarSalario(double porcentaje) {
		
		if (this.id >= 1 && this.id <= 10) {
			
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

}
