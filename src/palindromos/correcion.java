package palindromos;

public class correcion {
	
	private String texto;
	private static final String ABECEDARIO = "abcdefghijklmnñopqrstuwxyz";

	public correcion(String texto) {
		super();
		this.texto = texto;
	}
	
	public boolean esPalindromo() {
		
		// Convertir el texto original a minusculas
		// Limpiar
		// Convierto el texto al revés
		// Comparar y devolver boolean
		
		String minusculas, textoLimpio, alReves;
		minusculas = convertirAMinusculas();
		
		textoLimpio = limpiarTexto(minusculas);
		alReves = generarAlReves(textoLimpio);
		
		if (textoLimpio.equals(alReves)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	private String generarAlReves(String textoLimpio) {
		String alReves="";
		for(int i=textoLimpio.length();i>=0;i++) {
			alReves+=textoLimpio.charAt(i);
		}
		
		return alReves;
		
	}
	
	private String limpiarTexto(String minusculas) {
		String soloLetras = "";
		
		for(int i=0; i<minusculas.length();i++) {
			if(esLetra(minusculas.charAt(i))) {
				soloLetras+=minusculas.charAt(i);
			}
		}
		
		return soloLetras;
	}
	
	// SABES SI ES LETRA O NO ES LETRA
	private boolean esLetra(char caracter) {
		int posicion;
		posicion=ABECEDARIO.indexOf(caracter);
		// este if revisa si la letra está dentro de abecedario, porque si no devuelve -1 es porque está en ABECEDARIO
		if (posicion!=-1) {
			return true;
		} else {
			return false;
		}
	}

	private String convertirAMinusculas() {
		return this.texto.toLowerCase();
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
