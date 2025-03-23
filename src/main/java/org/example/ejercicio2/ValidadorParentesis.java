package org.example.ejercicio2;
import java.util.Stack;

public class ValidadorParentesis {
    public boolean estaBalanceado(String cadena) {
        Stack<Character> pila = new Stack<>();

        for (char c : cadena.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();

                if (!esParCorrespondiente(tope, c)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private boolean esParCorrespondiente(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '{' && cierre == '}') ||
                (apertura == '[' && cierre == ']');
    }
}
