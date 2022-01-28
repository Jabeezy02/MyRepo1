package com.csc205;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @BeforeEach
    void setUp() {
        //SEAT: Setup-Exercise Assert Teardown
        //setup
        int expected = 4;
        // exercise
        int actual = new Calculator().add(2, 2);
        //assertion
        assertEquals( expected, actual);
    }

    @Test
    void add() {
    }

    @Test
    void testAdd() {
        int expected = 6;
        int actual = new Calculator().add(2, 2);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void dividByZero(){
        assertThrows(ArithmeticException.class,() ->{
            new Calculator().divide(0,0);

        });
    }
}