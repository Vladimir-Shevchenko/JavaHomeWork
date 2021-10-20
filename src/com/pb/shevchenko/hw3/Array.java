package com.pb.shevchenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ten numbers");
       int count = 0;

       //input array
        for (int i = 0; i < 10 ; i++) {
            arr[i] = scanner.nextInt();
            if(arr[i]>0){count++;}
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Quantity of positive numbers: "+ count);

        //bubble sort
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));


    }
}
