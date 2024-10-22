package org.example;

import java.util.Scanner;

public class MenuPotencia {

    private final CalculadoraPotencia calculadora;

    // Constructor que inicializa la calculadora de potencia
    public MenuPotencia() {
        this.calculadora = new CalculadoraPotencia();
    }

    // Método que ejecuta el menú
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("===== Menú =====");
            System.out.println("1. Calcular potencia");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Leer (escribir) los números base y exponente
                    System.out.print("Ingrese la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();

                    // Calcular y mostrar el resultado usando la clase CalculadoraPotencia
                    int resultado = calculadora.calcularPotencia(base, exponente);
                    System.out.println("Resultado: " + base + "^" + exponente + " = " + resultado);
                    break;

                case 2:
                    // Salir del programa
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 2);

        scanner.close();
    }
}
