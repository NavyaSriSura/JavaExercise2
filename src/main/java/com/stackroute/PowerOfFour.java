package com.stackroute;

public class PowerOfFour {

        boolean isPowerOfFour(int n)
        {
            if(n == 0)
                return false;
            while(n != 1)//condition to check if number is a power of 4
            {
                if(n % 4 != 0)
                    return false;
                n = n / 4;
            }
            return true;
        }
    }

