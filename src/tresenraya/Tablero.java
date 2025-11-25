package tresenraya;

public class Tablero {

	private char[][] casilla = new char[3][3];
	private final char VACIA = '▢';
	private static final int N = 3;

	public Tablero() {

		for (int i = 0; i < casilla.length; i++) {

			for (int j = 0; j < casilla[i].length; j++) {

				casilla[i][j] = VACIA;

			}

		}
	}

	public void mostrarTablero() {

		System.out.println("  0  1  2");
		for (int i = 0; i < casilla.length; i++) {
			
			System.out.print((i) + " ");

			for (int j = 0; j < casilla[i].length; j++) {

				System.out.print(casilla[i][j] + " ");

			}

			System.out.println();

		}

	}
	
	private boolean dentroLimites(int fila, int col) {
        return fila >= 0 && fila < N && col >= 0 && col < N;
    }

	public boolean colocarFicha(int fila, int col, char ficha) {
		
		if(!dentroLimites(fila, col)) {
			return false;
		}
		
		if (!this.casillaLibre(fila, col)) {
			return false;
		}
		
		casilla[fila][col] = ficha;
		return true;
	}

	// true si dentro de rango y la casilla está vacía

	public boolean casillaLibre(int fila, int col) {
		
		if(!dentroLimites(fila, col)) {
			return false;
		}

		return casilla[fila][col] == VACIA;

	}

	// devuelve true sí, se cumplen las condiciones de filas iguales o columnas iguales o diagonales iguales
	
	public boolean hayTresEnRaya(char ficha) {

		// comprobamos la filas
		for (int i = 0; i < N; i++) {
			if (casilla[i][0] == ficha && casilla[i][1] == ficha && casilla[i][2] == ficha) {
				return true;
			}
		}

		// comprobamos las columnas
		for (int j = 0; j < N; j++) {
			if (casilla[0][j] == ficha && casilla[1][j] == ficha && casilla[2][j] == ficha) {
				return true;
			}
		}

		// diagonales
		if (casilla[0][0] == ficha && casilla[1][1] == ficha && casilla[2][2] == ficha) {
			return true;
		}

		if (casilla[0][2] == ficha && casilla[1][1] == ficha && casilla[2][0] == ficha) {
			return true;
		}

		return false;

	}

	// revisa si el tablero está lleno para declarar empate
	
	public boolean estaLleno() {

		for (int i = 0; i < casilla.length; i++) {

			for (int j = 0; j < casilla[i].length; j++) {

				if (casilla[i][j] == VACIA) {
					return false;
				}

			}

		}
		return true;
	}

}
