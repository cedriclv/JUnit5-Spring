package com.example.myFirstTests.unittesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testMultiply() {
        Calc c = new Calc();
        int i = c.multiply(3, 5);
        assertEquals(i, 15);
    }
}
