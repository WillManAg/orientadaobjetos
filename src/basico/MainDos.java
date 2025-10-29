package basico;
import java.util.Scanner;

public class MainDos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Usuario usu1 = new Usuario();
		int tecla = 0, userSalario;
		String userNombre;
		double userNomina;
		
		while (tecla != 4) {
		// Menu
		System.out.println("Selecciona una opción: ");
		System.out.println("1. Crear usuario");
		System.out.println("2. Mostrar Datos");
		System.out.println("3. Modificar el salario");
		System.out.println("4. Salir");

		tecla = teclado.nextInt();
			if (tecla < 1 || tecla > 4) {
			System.out.println("Este número no está dentro del menú.");
			} else if (tecla == 1) {
				System.out.println("Bienvenido al menú de creación de usuario");
				System.out.println("Primero introduce el nombre del usuario:");
				userNombre = teclado.next();
				usu1.setNombre(userNombre);
				System.out.println("Ahora introduce el salario de la persona:");
				userSalario = teclado.nextInt();
				usu1.setNomina(userSalario);
			} else if (tecla == 2) {
				usu1.mostrarDatos();
			} else if (tecla == 3) {
				System.out.println("Vamos a modificar el salario: ");
				System.out.println("Indica cuánto es el porcentaje que quieres subir: ");
				userNomina = teclado.nextDouble();
				usu1.incrementarSalario(userNomina, 1, 2);
				System.out.println("El nuevo salario es: " + usu1.getNomina());
			} else {
				System.out.println("¡hasta otra!");
				tecla = 4;
			}
		}
		teclado.close();
	}

}
