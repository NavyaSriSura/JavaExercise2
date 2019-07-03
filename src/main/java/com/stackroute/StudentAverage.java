package com.stackroute;

public class StudentAverage
{
    int numberOfStudents;
   int[] grades;
   int sum=0;
   public double calculateAverage(int grades[]) //method for calculating average
   {
       for(int i=0;i<grades.length;i++)
       {
           sum+=grades[i];
       }

       return sum/grades.length;
   }


    public int findMaximum(int grades[])//method for finding maximum among all elements
    {
        int max=grades[0];
        for(int i=0;i<grades.length;i++)
        {
            if(max<grades[i])
                max=grades[i];
        }
        return max;
    }
    public int findMinimum(int grades[])//method for finding minimum among given elements
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
