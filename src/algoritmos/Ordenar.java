package algoritmos;

public class Ordenar {

    // Método que ordena un array de enteros de menor a mayor
    public int[] menorAMayor(int[] numeros) {

        // Recorre el array desde el inicio hasta el penúltimo elemento
        for (int i = 0; i < numeros.length - 1; i++) {

            // Guarda la posición del valor más pequeño encontrado hasta ahora
            int posicion = i;

            // Recorre el resto del arreglo buscando un número menor al actual
            for (int j = i + 1; j < numeros.length; j++) {

                // Si encontramos un número más pequeño, actualizamos la posición
                if (numeros[j] < numeros[posicion]) {
                    posicion = j;
                }
            }

            // Si encontramos un número menor en otra posición, intercambiamos valores
            if (posicion != i) {
                int temporal = numeros[i];           // Guardamos el valor actual
                numeros[i] = numeros[posicion];      // Lo reemplazamos por el menor encontrado
                numeros[posicion] = temporal;        // Movemos el valor guardado a la posición donde estaba el menor
            }
        }

        // Devolvemos el arreglo ya ordenado
        return numeros;
    }

}
