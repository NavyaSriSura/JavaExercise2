package com.stackroute;

public class StudentAverage
{
    int numberOfStudents;
   int[] grades;
   int sum=0;
   public double calculateAverage(int grades[])
   {
       for(int i=0;i<grades.length;i++)
       {
           sum+=grades[i];
       }

       return sum/grades.length;
   }


    public int findMaximum(int grades[])
    {
        int max=grades[0];
        for(int i=0;i<grades.length;i++)
        {
            if(max<grades[i])
                max=grades[i];
        }
        return max;
    }
    public int findMinimum(int grades[])
    {
        int max=grades[0];
        for(int i=0;i<grades.length;i++)
        {
            if(max>grades[i])
                max=grades[i];
        }
        return max;
    }

}
