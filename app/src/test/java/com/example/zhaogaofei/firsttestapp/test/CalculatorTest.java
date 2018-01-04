package com.example.zhaogaofei.firsttestapp.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void sum() throws Exception {
        assertEquals(6, calculator.sum(1, 5), 0);// 期望值，运行结果，偏差
    }

    @Test
    public void substract() throws Exception {
        assertEquals(3, calculator.substract(6, 3), 0);
    }

    @Test
    public void divide() throws Exception {
        assertEquals(3, calculator.divide(4, 2), 1);
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(5, calculator.multiply(2, 3), 1);
    }

    @Test
    public void testList() throws Exception {
        calculator.printList();
    }

}