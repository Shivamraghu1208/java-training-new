package com.training;

import java.util.Arrays;

public class First {

    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0};
        int n= arr.length;
        int[] ints = moveZero(arr, n);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] moveZero(int[] arr, int n) {

        int[] temp=new int[n];
        int j=0;
        for (int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        for (int i=0;i<n;i++)
        {
           arr[i]=temp[i];
        }
        return arr;

    }
}
