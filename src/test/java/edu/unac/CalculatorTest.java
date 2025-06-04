package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }
    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.multiply(2, 2));
    }
}