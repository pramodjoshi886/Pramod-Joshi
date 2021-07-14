package com.pj.tdd.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest 
{
	
	@Test
    public void testAddWithEmptyString()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add(" ");
        assertEquals(0, result);
    }
	
	@Test
    public void testAddStringWithOneNumber()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1");
        assertEquals(1, result);
    }
	
	@Test
    public void testAddStringWith2Numbers()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2");
        assertEquals(3, result);
    }
	
	@Test
    public void testAddStringWithMoreThan2Numbers()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1,2,4,5,8,6,4");
        assertEquals(30, result);
    }
}
