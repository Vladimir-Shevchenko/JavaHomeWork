package com.pb.shevchenko.hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String s = scanner.nextLine();

        String[]arr=s.split(" ");
for(String i:arr){
    System.out.print((i.charAt(0)+"").toUpperCase()+i.substring(1)+" ");
}

    }
}
