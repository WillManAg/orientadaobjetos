package agentaList;

public class Empresa {

	private String direccion;
	private int sector;
	
	public Empresa(String direccion, int sector) {
		this.direccion = direccion;
		this.sector = sector;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getSector() {
		return sector;
	}

	public void setSector(int sector) {
		this.sector = sector;
	}
	
	
	
}
