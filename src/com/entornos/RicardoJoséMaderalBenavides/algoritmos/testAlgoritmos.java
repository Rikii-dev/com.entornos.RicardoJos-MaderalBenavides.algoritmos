package com.entornos.RicardoJoséMaderalBenavides.algoritmos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testAlgoritmos {

    static algoritmos a;

    @BeforeAll
    static void setup() {
        a = new Algoritmospml();
    }

    @Test
    void testFibonacci() {
        assertEquals(21, a.fibonacci(8));
        assertEquals(5, a.fibonacci(5));
        assertEquals(3, a.fibonacci(4));
    }

    @Test
    void testFactorial() {
        assertEquals(720, a.factorial(6));
        assertEquals(6, a.factorial(3));
        assertEquals(2, a.factorial(2));
    }

    @Test
    void testPrimo() {
        assertTrue(a.primo(3));
        assertFalse(a.primo(9));
        assertFalse(a.primo(8));
    }

    @Test
    void testFibonacciNegativo() {
        assertThrows(IllegalArgumentException.class, () -> { a.fibonacci(-1); });
    }

    @Test
    void testPrimosNegativo() {
        assertThrows(IllegalArgumentException.class, () -> { a.primo(-1); });
    }

    @Test
    void testFactorialNegativo() {
        assertThrows(IllegalArgumentException.class, () -> { a.factorial(-1); });
    }
}
