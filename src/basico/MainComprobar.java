package basico;

public class MainComprobar {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor(1, "Ernesto", "Hernandez", "Española");
		Autor autor2 = new Autor(2, "Nacho", "Miguel", "Española");
		
		Libro libro1 = new Libro(1, "Hola", autor1, 1993);
		Libro libro2 = new Libro(2, "Adios", autor2, 1993);
		
		Usuario usu1 = new Usuario("Roberto", 1600.00, libro1, libro1, "Arroz123");
		Usuario usu2 = new Usuario("Liam", 400.00, libro2, libro2, "Arroz123");
		
		
		usu1.mostrarDatos();
		usu2.mostrarDatos();
		

	}

}
