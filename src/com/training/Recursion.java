package com.training;



public class Recursion {
     public int print(int n)
     {
         if(n<1)
         {
             return 0;
         }
         return n+print(n-1);
     }


    public static void main(String[] args) {
        Recursion r=new Recursion();
        System.out.println(r.print(5));
    }
}
