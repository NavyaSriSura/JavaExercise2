package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberClassTest
{
    MemberClass memberClass;
@Before
    public void setUp()
{
    memberClass=new MemberClass();
}
@After
    public void tearDown()
{
    memberClass=null;
}
@Test
    public void testShouldReturnName()
{
    memberClass.getName("stackroute");
    String result=memberClass.setName();
    assertEquals(result,"stackroute");
}
@Test
public void testSholdReturnAge()
{
    memberClass.getAge(20);
    int result=memberClass.setAge();
    assertEquals(result,20);
}
    @Test
    public void testShouldReturnSalary()
    {
        memberClass.getSalary(700000);
        int result=memberClass.setSalary();
        assertEquals(result,700000);
    }
}