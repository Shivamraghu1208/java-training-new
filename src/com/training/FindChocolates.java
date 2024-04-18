package com.training;

public class FindChocolates {

    public static int findChocolates(int rupees, int cost, int wrapper) {
        int chocolates;
        int temp;
        int remainingwrapper;
//s
        if(cost>=1) {
            chocolates = rupees / cost;
            temp = chocolates;

            while (temp >= wrapper) {
                remainingwrapper = temp % wrapper;
                temp = temp / wrapper;
                chocolates = chocolates + temp;
                temp = temp + remainingwrapper;

            }
            return chocolates;
        }
        else
        {
            System.out.println("Cost can't be zero  ---");
            return -1;
        }

    }

    public static void main(String[] args) {
        int rupees = 30;
        int cost =0;
        int wrapper = 7;
        System.out.println(findChocolates(rupees, cost, wrapper));
    }
}

