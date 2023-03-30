package atu.ie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;

    @Test
    public void testAdd() {
        myCalc = new Calculator();
        assertEquals(40, myCalc.add(20,20));
    }

    @Test
    public void testDelete() {
        myCalc = new Calculator();
        assertEquals(0, myCalc.subtract(20,20));
    }
}
