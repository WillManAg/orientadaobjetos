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

}
