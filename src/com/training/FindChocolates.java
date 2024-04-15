package com.training;

public class FindChocolates {

    public static int findChocolates(int rupees, int cost, int wrapper) {
        int chocolates;
        int temp;
        int remainingwrapper;

        if(cost>=1) {
            chocolates = rupees / cost;
            temp = chocolates;

            while (temp >= wrapper) {
                remainingwrapper = temp % wrapper; //0+2
                temp = temp / wrapper;  //5 1
                chocolates = chocolates + temp;//15+5+1
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

