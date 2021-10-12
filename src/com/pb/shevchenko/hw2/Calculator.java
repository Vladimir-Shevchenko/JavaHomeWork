package com.pb.shevchenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        int operand1 = scanner.nextInt();

        System.out.println("Enter first number");
        int operand2 = scanner.nextInt();

        System.out.println("Enter arithmetic sign");
        String arithmeticSign = scanner.nextLine();

        switch (arithmeticSign){
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1*operand2);
                break;
            case "/":
                System.out.println(operand1/operand2);
                break;
        }

    }
}
