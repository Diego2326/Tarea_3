package org.example.ejercicio3;

public class BuscadorBinario {
    public int buscar(int[] lista, int objetivo) {
        int izquierda = 0;
        int derecha = lista.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (lista[medio] == objetivo) {
                return medio;
            } else if (lista[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}
