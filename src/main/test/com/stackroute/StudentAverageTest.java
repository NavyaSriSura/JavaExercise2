package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentAverageTest {
    int numberOfStudents;
    StudentAverage studentAverage;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        studentAverage=new StudentAverage();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        studentAverage=null;
    }
   @Test
    public void ShouldReturnAverage()
   {
       numberOfStudents=4;
       int grades[]={25,25,25,25};
       double average=studentAverage.calculateAverage(grades);
       assertEquals(average,25.0,0.001);
   }
   @Test
   public void shouldFindMaximum()
   {
       numberOfStudents=4;
       int grades[]={25,35,46,76};
       int max=studentAverage.findMaximum(grades);
       assertEquals(max,76);
   }
    @Test
    public void shouldFindMinimum()
    {
        numberOfStudents=4;
        int grades[]={25,35,46,76};
        int min=studentAverage.findMinimum(grades);
        assertEquals(min,25);
    }
   }


