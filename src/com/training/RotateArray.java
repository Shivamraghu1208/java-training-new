package com.training;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] arr,int k,int n)
    {
        k=k%n;
        int[] temp=new int[k];
         for(int i=0;i<k;i++)
         {
               temp[i]=arr[i];
         }
         for (int i=k;i< n;i++)
         {
             arr[i-k]=arr[i];
         }
         int j=0;
         for(int i=n-k;i<n;i++)
         {
             arr[i]=temp[j];
             j++;
         }
         return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=10;
        int n= arr.length;
        int[] ints = rotateArray(arr, k,n);
        System.out.println(Arrays.toString(ints));
    }

}
