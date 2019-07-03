package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenTest
{
CheckEven checkEven;
    @Before
    public void setUp()
    {
        checkEven=new CheckEven();
    }
    @After
    public void tearDown()
    {
        checkEven=null;
    }
    @Test
    public void testGivenANumberReturnEven()
    {
       String result=checkEven.isEven(24);
       assertEquals(result,"true");
    }

    @Test
    public void testGivenANumberReturnOdd()
    {
        String  result=checkEven.isEven(25);
        assertEquals(result,"false");
    }
    @Test
    public void testGivenANumberReturnError()
    {
        String result=checkEven.isEven(-5);
        assertEquals(result,"Enter valid number");
    }
    @Test
    public void testGivenZeroReturnEven()
    {
        String result=checkEven.isEven(0);
        assertEquals(result,"true");
    }
    @Test(expected=NumberFormatException.class)
    public void testGivenNonIntegerRaiseException()
    {
        String result=checkEven.isEven(a);
    }
}
