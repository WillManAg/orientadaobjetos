package basico;

public class MainComprobar {

	public static void main(String[] args) {
		
		Usuario usu1 = new Usuario(1, "Alejandro", 1600.00);
		Usuario usu2 = new Usuario(2, "Alijandro", 1700.00);
		
		if (usu1.sonIguales(usu2)) {
            System.out.println("Los usuarios tienen el mismo nombre");
        } else {
            System.out.println("Los usuarios tienen nombres distintos");
        }
		
		

	}

}
