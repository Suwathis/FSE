package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        
        calc = new Calculator();
        System.out.println("Setup: Calculator instance created");
    }

    @After
    public void tearDown() {
        
        calc = null;
        System.out.println("Teardown: Calculator instance set to null");
    }

    @Test
    public void testAdd() {
        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    public void testMultiply() {
        // Arrange
        int x = 5;
        int y = 4;

        // Act
        int result = calc.multiply(x, y);

        // Assert
        assertEquals(20, result);
    }
}
