package org.example.ejercio1;

import java.util.LinkedList;
import java.util.Queue;

public class GestorDeTurnos {
    private Queue<Turno> colaDeTurnos;
    private int siguienteNumero;

    public GestorDeTurnos() {
        this.colaDeTurnos = new LinkedList<>();
        this.siguienteNumero = 1;
    }

    public void agregarTurno() {
        Turno nuevoTurno = new Turno(siguienteNumero++);
        colaDeTurnos.add(nuevoTurno);
        System.out.println("Agregar turno " + nuevoTurno.getNumero());
    }

    public void atenderTurno() {
        if (colaDeTurnos.isEmpty()) {
            System.out.println("No hay turnos para atender.");
        } else {
            Turno atendido = colaDeTurnos.poll();
            System.out.println("Atender turno -> Cliente con turno " + atendido.getNumero() + " atendido");
        }
    }

    public void mostrarTurnosEnEspera() {
        if (colaDeTurnos.isEmpty()) {
            System.out.println("No hay turnos en espera.");
        } else {
            System.out.print("Mostrar turnos en espera -> [");
            StringBuilder turnos = new StringBuilder();
            for (Turno t : colaDeTurnos) {
                turnos.append(t.getNumero()).append(", ");
            }
            if (turnos.length() >= 2) {
                turnos.setLength(turnos.length() - 2);
            }
            System.out.println(turnos + "]");
        }
    }
}
