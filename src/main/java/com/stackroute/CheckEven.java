package com.stackroute;

public class CheckEven
{
public static  String isEven(int number)
{
    String var="";
    if(number<0)
    {
        var="Enter valid number";

    }
    else
     {
        if(number%2==0)//condition for checking even numbers
          var="true";
        else
            var="false";
     }

        return var;

}
}
