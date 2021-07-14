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
	
	@Test
    public void testAddStringWithNewLineChars()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("1\\n2,3");
        assertEquals(6, result);
    }
	
	@Test
    public void testAddStringWithDifferentDelimeters()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("//;\\n1;2");
        assertEquals(3, result);
    }
	
	@Test
    public void testAddStringWithNoNumbers()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("testAddStringWithNoNumbers");
        assertEquals(0, result);
    }
	
	@Test(expected=NegativeNumberException.class)
    public void testAddStringWithNegativeNumbers()
    {
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.add("-1,-2,1");
    }
	
	@Test
    public void testAddStringWithMultipleDelimeters1()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("//[***]\\n1***2***3");
        assertEquals(6, result);
    }
	
	@Test
    public void testAddStringWithMultipleDelimeters2()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("//[*][%]\\n1*2%3");
        assertEquals(6, result);
    }
	
	@Test
    public void testAddStringWithNumberBiggerThan1000()
    {
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.add("2,1001");
        assertEquals(2, result);
    }
}
