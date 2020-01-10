package com.src;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    private static Calculator calc;

    @Before
    public void init() {
        calc = new Calculator();
    }

    @org.junit.Test
    public void additionTest() throws Exception {
        //calc = new Calculator();
        assertEquals(5, calc.addition(2, 3));
    }

    @org.junit.Test
    public void additionFloatTest() {
        //calc = new Calculator();
        assertEquals(5.1, calc.addition(2, 3.1), 0);
    }

    @org.junit.Test
    public void additionDoubleTest() {
        //calc = new Calculator();
        assertEquals(5.12, calc.addition(2.02, 3.1), 0);
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void additionTestCharacterPresent() {
        double add = calc.addition("a", "3");
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void additionTestOverflow() throws Exception {
        int over = calc.addition(2147483647, 123);
    }


    @org.junit.Test
    public void subtractionTest() {
        assertEquals(7, calc.subtraction(15.0, 8), 0);
    }

    @org.junit.Test
    public void subtractionFloatTest() {
        assertEquals(7.0, calc.subtraction(15.0, 8), 0);
    }

    @org.junit.Test
    public void subtractionDoubleTest() {
        assertEquals(7.000, calc.subtraction(15.00, 8.00), 0);
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void subtractionTestCharacterPresent() {
        double sub = calc.subtraction("a", "4");
    }

    @org.junit.Test
    public void multiplicationTest() {
        assertEquals(32, calc.multiplication(4, 8));
    }

    @org.junit.Test
    public void multiplicationFloatTest() {
        assertEquals(32.0, calc.multiplication(4.0, 8), 0);
    }

    @org.junit.Test
    public void multiplicationDoubleTest() {
        assertEquals(32.000, calc.multiplication(4.00, 8.00), 0);
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void multiplicationTestCharacterPresent() {
        double mul = calc.multiplication("a", "");
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void divisionTestZero() {
        int div = calc.division(8, 0);
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void divisionTestCharacterPresent() {
        double div = calc.division("a", "4");
    }

    @org.junit.Test
    public void divisionTest() {
        assertEquals(5, calc.division(25, 5));
    }

    @org.junit.Test
    public void divisionFloatTest() {
        assertEquals(5.0, calc.division(25.0, 5.0), 0);
    }

    @org.junit.Test
    public void divisionDoubleTest() {
        assertEquals(5.00, calc.division(25.0, 5.0), 0);
    }

    @org.junit.Test
    public void squareTest() throws Exception {
        assertEquals(25, calc.square(5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void squareOverflowTest() throws Exception {
        int sq = calc.square(98989898);
    }

    @org.junit.Test
    public void squareFloatTest() {
        assertEquals(25.0, calc.square(5.0), 0);
    }

    @org.junit.Test
    public void squareDoubleTest() {
        assertEquals(25.00, calc.square(5.00), 0);
    }

    @org.junit.Test(expected = NumberFormatException.class)
    public void squareTestCharacterPresent() {
        double sq = calc.square("a");
    }

}