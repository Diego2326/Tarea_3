package org.example.ejercio1;

public class Turno {
    private int numero;

    public Turno(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.valueOf(numero);
    }
}
