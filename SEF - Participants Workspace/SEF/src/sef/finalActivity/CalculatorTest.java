package sef.finalActivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator("Casio");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAdd() {
        assertEquals("Sum of two numbers are not correct", 30.0, calculator.add(20.0, 10.0), 0);
    }

    public void testSubtract() {
        assertEquals("Subtract of two numbers are not correct", 12.6, calculator.subtract(20.0, 7.4), 0);
    }

    public void testMultiply() {
        assertEquals("Multiplication of two numbers are not correct", 13.02, calculator.multiply(4.2, 3.1), 0);
    }

    public void testDivide() {
        assertEquals("Division of two numbers are not correct", 4.73, calculator.divide(10.4, 2.2), 0);
    }

}
