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
    public void testGivenANumberShouldReturnEven()
    {
       String result=checkEven.isEven(24);
       assertEquals(result,"true");
    }

    @Test
    public void testGivenANumberShouldReturnOdd()
    {
        String  result=checkEven.isEven(25);
        assertEquals(result,"false");
    }
    @Test
    public void testGivenANumberShouldReturnError()
    {
        String result=checkEven.isEven(-5);
        assertEquals(result,"Enter valid number");
    }
}
