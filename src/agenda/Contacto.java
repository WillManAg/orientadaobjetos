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
	
	
	public Contacto(int id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
		
		this.id = idGenerado++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	} 
	
	public void mostrarContacto() {
		
		System.out.println("CONTACTO AGENDADO CON ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellido: " + this.apellido);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("Email: " + this.email);
		System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
		
	}
	
	

}
