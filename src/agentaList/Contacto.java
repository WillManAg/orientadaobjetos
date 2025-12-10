package agentaList;

public class Contacto {

	private int id;
	private String telefono;
	private String correo;
	private Persona persona;
	private Empresa empresa;
	
	public Contacto(int id, String telefono, String correo, Persona persona) {

		this.id = id;
		this.telefono = telefono;
		this.correo = correo;
		this.persona = persona;
	}

	public Contacto(int id, String telefono, String correo, Empresa empresa) {

		this.id = id;
		this.telefono = telefono;
		this.correo = correo;
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}


