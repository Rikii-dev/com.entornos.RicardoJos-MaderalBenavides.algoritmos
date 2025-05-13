package com.entornos.RicardoJoséMaderalBenavides.algoritmos;


/* 
 * @author Ricardo
 */
public abstract class algoritmos {
	
	/**
     * Calcula el valor de la sucesión de Fibonacci correspondiente a la posición indicada.
     * 
     * @param num posición en la sucesión de Fibonacci. Debe ser mayor o igual a 0.
     * @return el número de Fibonacci en la posición especificada.
     * @throws IllegalArgumentException si el número es negativo.
     */
    public int fibonacci(int num) {
        if (num < 0)
            throw new IllegalArgumentException("La posición debe ser mayor o igual a 0.");
        if (num == 0) return 0;
        if (num == 1) return 1;

        int fibo = 0, fiboo = 1;
        for (int i = 2; i <= num; i++) {
            int fibooo = fibo + fiboo;
            fibo = fiboo;
            fiboo = fibooo;
        }
        return fibo; }
 
    
    /**
     * Calcula el factorial de un número entero.
     * 
     * @param num número entero del que se desea calcular el factorial. Debe ser mayor o igual a 0.
     * @return el resultado del factorial del número indicado.
     * @throws IllegalArgumentException si el número es negativo.
     */
    public int factorial(int num) {
        if (num < 0)
            throw new IllegalArgumentException("El número debe ser mayor o igual a 0.");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
   
   
}

