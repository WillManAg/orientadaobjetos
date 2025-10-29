package basico;

public class Main {

	public static void main(String[] args) {
		
		
		Usuario usu1, usu2, usu3;

		
		usu1 = new Usuario(1, "William", 1600.00);
		usu2 = new Usuario(11, "Wilson", 400.00);
		usu3 = new Usuario(3, "Robert", 2400.00);
		
		System.out.println("Usu1");
		// imprime un mostrar datos, no necesita un pln
		usu1.mostrarDatos();

		
		System.out.println("Usu2");
		usu2.mostrarDatos();

		System.out.println("Usu3");
		usu3.mostrarDatos();

	
		usu1.incrementarSalario(100);
		usu2.incrementarSalario(100);
		
		usu1.mostrarDatos();
		usu2.mostrarDatos();
		
		
		
		
		
		
		
		
	}

}
