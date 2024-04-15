package com.training;

public class MoveZeroToEnd {

    public static void moveAtEnd(int arr[]) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            System.out.println("Zero not present");
        else {

            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 62, 0, 0, 0, 87, 0, 5, 3};
        moveAtEnd(arr);

    }

}


