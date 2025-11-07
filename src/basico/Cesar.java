package basico;

public class Cesar {
	
	public static String codificar(String texto) {
		
		String textoCodificado = "";
		texto = texto.toLowerCase();
		
		for (int i = 0; i < texto.length(); i++) {
			
			char caracter = texto.charAt(i);
			
			if (caracter >= 'a' && caracter <= 'z') {
				
				if (caracter == 'x') {
					caracter = 'a';
				} else if (caracter == 'y') {
					caracter = 'b';
				} else if (caracter == 'z') {
					caracter = 'c';
				} else {
					// como se opera con numeros, para que no devuelva un número, hay que transformarlo de nuevo a char
					caracter = (char) (caracter + 3);
				}
				
			}
			textoCodificado += caracter;
			
		}
		return textoCodificado;
		
	}

}
