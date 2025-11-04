package basico;

public class Utilidades {

	
	// Método que comprueba si un texto contiene solo dígitos
	public static boolean soloDigitos(String texto) {
		char caracter;
		// Si el texto está vacío o es null, devuelve false
		if (texto == null || texto.isEmpty()) {
			return false;
		}

		// Recorremos carácter por carácter
		for (int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			if (!Character.isDigit(caracter)) { // Si algún carácter NO es un dígito
				return false;
			}
		}
		return true; // Si todos los caracteres eran dígitos
	}
	// comprueba si el texto solo tiene letras en ingles
	public static boolean soloLetrasIngles(String texto) {
		char caracter;
		if (texto == null || texto.isEmpty()) {
			
			return false;
			
		}
		
		for(int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			// Si no está entre a y z ni A y Z, devuelve false
			if (!((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z'))) {
				return false;
			}
		}
		return true;
	}

}
