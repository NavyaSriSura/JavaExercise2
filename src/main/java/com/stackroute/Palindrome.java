package com.stackroute;

public class Palindrome {

    public Boolean checkPalindrome(int number)
    {
        Boolean var;
        int temp=number,sum=0,remainder;
        while(temp>0)
        {
            remainder=temp%10;
            sum=sum*10+remainder;
            temp/=10;
        }
        if(sum==number)
            var=true;
        else var=false;
        return var;
    }
}
