package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        int actualValue=Calculator.add(20,3);
        assertEquals(23,actualValue);
    }

    @Test
    void addTestFail() {
        int actualValue=Calculator.add(20,3);
        assertNotEquals(10,actualValue);
    }

    @Test
    void subtractTest() {
        int actualValue=Calculator.subtract(20,3);
        assertEquals(17,actualValue);
    }

    @Test
    void subtractTestFail() {
        int actualValue=Calculator.subtract(20,3);
        assertNotEquals(10,actualValue);
    }

    @Test
    void multiplyTest() {
        int actualValue=Calculator.multiply(20,3);
        assertEquals(60,actualValue);
    }

    @Test
    void multiplyTestFail() {
        int actualValue=Calculator.multiply(20,3);
        assertNotEquals(70,actualValue);
    }

    @Test
    void divisionTest() {
        int actualValue=Calculator.division(20,3);
        assertEquals(6,actualValue);
    }

    @Test
    void divisionTestFail() {
        int actualValue=Calculator.division(20,3);
        assertNotEquals(9,actualValue);
    }

    @Test
    void divisionExceptionTesting(){
        assertThrows(ArithmeticException.class,()->Calculator.division(1,0));
    }

    @Test
    void advancedAdditionTest() {
    }


    @Test
    void advancedSubtractTest() {
    }
}