package palindromos;

public class Texto {
	
	private String palindromo;
	
	public Texto(String palindromo) {
		
		this.palindromo = palindromo;
		
	}
	
	public boolean esPalindromo() {
		
		String valorUno="", valorDos="";
		
		char letra;
		
		int longitud = palindromo.length();
		
		for (int i=0; i <= longitud; i++) {
			
			letra=palindromo.charAt(i);
			
			valorUno+=letra;
		}
		
		for (int j=longitud; j>=0; j--) {
			
			letra=palindromo.charAt(j);
			
			valorDos+=letra;
			
		}
		
		if (valorUno == valorDos) {
			return true;
		} else {
			return false;
		}
		
	}
	
	

}
