package tresenraya;

import java.util.Scanner;

public class MainPartida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char seleccion;

        System.out.println("Bienvenido al 3 en raya");
        System.out.print("Nombre jugador 1: ");
        String nombre1 = teclado.nextLine();
        System.out.print("Selecciona " + nombre1 + " (1.✕ o 2.◯): ");
        seleccion = ;
        if (seleccion == 1) {
        	char ficha1
        }
   

        

        Jugador jugador1 = new Jugador(nombre1, ficha1);
        Jugador jugador2 = new Jugador(nombre2, ficha2);

        Partida partida = new Partida(jugador1, jugador2);
        partida.jugar();

        teclado.close();
    }

    private static char pedirFicha(Scanner sc) {
        while (true) {
            String s = sc.nextLine().toUpperCase();
            if (s.equals("X") || s.equals("O")) {
                return s.charAt(0);
            }
            System.out.print("Ficha inválida. Elige 'X' o 'O': ");
        }
    }
}
