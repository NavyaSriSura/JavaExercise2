package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFourTest
{
    PowerOfFour powerOfFour;
    @Before
    public void setUp()
    {
        powerOfFour=new PowerOfFour();
    }
    @After
    public void tearDown()
    {
        powerOfFour=null;
    }
    @Test
    public void testGivenANumberShouldFindWhetherItIsaPowerOfFourOrNot()
    {
        Boolean result=powerOfFour.isPowerOfFour(16);
        assertEquals(true,result);
    }

    @Test
    public void testGivenANumberDivisibleBy5ShouldReturnFalse()
    {
        Boolean result=powerOfFour.isPowerOfFour(15);
        assertEquals(false,result);
    }
    @Test
    public void testGivenANumberPowerOf4ShouldReturnTrue()
    {
        Boolean result=powerOfFour.isPowerOfFour(64);
        assertEquals(true,result);
    }

}