package com.entornos.RicardoJoséMaderalBenavides.algoritmos;

public class principal {

    public static void main(String[] args) {
        int[] numeros = new int[3];
        boolean[] usados = new boolean[11]; // para controlar repetidos (índices del 0 al 10)

        int count = 0;
        while (count < 3) {
            int n = (int) (Math.random() * 9) + 2; // entre 2 y 10

            if (!usados[n]) {
                usados[n] = true;
                numeros[count++] = n;
            }
        }

        int[] resultadoFibonacci = new int[3];
        int[] resultadoFactorial = new int[3];
        boolean[] resultadoPrimos = new boolean[3];

        algoritmos a = new algoritmos() {};

        for (int i = 0; i < 3; i++) {
            resultadoFibonacci[i] = a.fibonacci(numeros[i]);
            resultadoFactorial[i] = a.factorial(numeros[i]);
            resultadoPrimos[i] = a.primo(numeros[i]);
        }

        
    }
}
