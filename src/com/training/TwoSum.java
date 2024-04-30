package com.training;

import java.util.Arrays;

public class TwoSum {
    public static int[] sum(int[] A,int[] B,int n,int m)
    {
        int[] result = new int[Math.max(n, m)]; // Result array to store sum
        int maxLength = Math.max(n, m);
       int temp=0;
       int temp1=0;
        for (int i=0;i<maxLength;i++)
        {
            if(i<n) {
                temp = (temp + A[i]) * 10;
            }
            if(i<m)
            {
                temp1 = (temp1 + B[i]) * 10;
            }

        }
        temp=temp/10;
        temp1=temp1/10;

        int newtemp=temp+temp1;
        System.out.println(newtemp);
        int[] newArr=new int[maxLength];
        int i=maxLength-1;
        while (newtemp>0)
        {
            int lastdigit=newtemp%10;
            newArr[i]=lastdigit;
            newtemp=newtemp/10;
            i--;
        }

      return newArr;
    }


    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        int[] B={3,2,1,4};
        int n=A.length;
        int m=B.length;
        System.out.println(Arrays.toString(sum(A, B, n, m)));

    }
}
