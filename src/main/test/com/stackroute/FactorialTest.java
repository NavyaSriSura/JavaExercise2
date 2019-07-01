package com.stackroute;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class FactorialTest
{
    Factorial factorial;
    @Before
    public void setUp()
    {
        factorial=new Factorial();
        System.out.println("Before");
    }
   @After
    public void tearDown()
   {
       factorial=null;
       System.out.println("After");
   }


}