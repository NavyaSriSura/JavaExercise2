package com.stackroute;

import java.security.spec.NamedParameterSpec;

public class MemberClass
{
    String name;
    int age;
    int salary;
//getter methods for assingning values
public  void getName(String name)
{
    this.name=name;
}
public void getSalary(int salary)
{
    this.salary=salary;
}
public void getAge(int age)
{
    this.age=age;
}
//setter methods to return values
public  int setAge()
{
    return  age;
}
public String setName()
{
    return name;
}
public int setSalary()
{
    return salary;
}
}
