package org.example;

public class CalculadoraPotencia {

    /**
     * Método recursivo para calcular la potencia de un número.
     *
     * toma de parametros la base y el exponente
     * @return El resultado de base^exponente
     */
    public int calcularPotencia(int base, int exponente) {
        // Caso base: cualquier número elevado a 0 es 1
        if (exponente == 0) {
            return 1;
        }
        // Caso recursivo: multiplicar la base por la potencia de la base con exponente - 1
        return base * calcularPotencia(base, exponente - 1);
    }
}
