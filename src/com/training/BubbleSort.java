package com.training;

public class BubbleSort {

    public static void sort(int arr[],int length)
    {
        for(int i=0;i<length ;i++)
        {
            for(int j=0;j<length-1-i;j++)
            {
               if(arr[j]>arr[j+1])
               {
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
            }

        }
        for (int i:arr) {

            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[]={5,3,7,2,9,86,85};
        int length= arr.length;
        sort(arr,length);
    }


}
