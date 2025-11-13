package basket;

public class Jugador {
	
	private String nombre;
	private double altura;
	private double porcentajeDos;
	private double porcentajeTres;
	
	public Jugador() {
		
		this.nombre = "Jugador";
		this.altura = 1.85;
		this.porcentajeDos = 40;
		this.porcentajeTres = 25;
		
	}
	
	public Jugador(String nombre, double altura, double porcentajeDos, double porcentajeTres) {
		
		this.nombre = nombre;
		this.altura = altura;
		this.porcentajeDos = porcentajeDos;
		if (this.porcentajeDos>100) {
			this.porcentajeDos=100;
		}
		this.porcentajeTres = porcentajeTres;
		if (this.porcentajeTres>100) {
			this.porcentajeTres=100;
		}
		
	}
	
	public boolean lanzarDeDos() {
		
		if (Math.random()<this.porcentajeDos/100) {
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	public boolean lanzarDeTres() {
		
		if (Math.random()<this.porcentajeTres/100) {
			return true;
			
		} else {
			
			return false;
		}
		
	}
	
	public void entrenarDos() {
		if (Math.random()<0.5) {
			this.porcentajeDos+=0.5;
			if (this.porcentajeDos>100) {
				this.porcentajeDos=100;
			}
			
		}
	}
	
	public void entrenarTres() {
		if (Math.random()<0.5) {
			this.porcentajeTres+=0.5;
			if (this.porcentajeTres>100) {
				this.porcentajeTres=100;
			}
		}
	}
	
	public void entrenarDos (int dias) {
		
		for (int i=0; i<dias; i++) {
			
			this.entrenarDos();
			
		}
		
	}
	
	public void entrenarTres (int dias) {
		
		for (int i=0; i<dias; i++) {
			
			this.entrenarTres();
			
		}
		
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPorcentajeDos() {
		return porcentajeDos;
	}

	public void setPorcentajeDos(double porcentajeDos) {
		this.porcentajeDos = porcentajeDos;
		if (this.porcentajeDos>100) {
			this.porcentajeDos=100;
		}
	}

	public double getPorcentajeTres() {
		return porcentajeTres;
	}

	public void setPorcentajeTres(double porcentajeTres) {
		this.porcentajeTres = porcentajeTres;
		if (this.porcentajeTres>100) {
			this.porcentajeTres=100;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
