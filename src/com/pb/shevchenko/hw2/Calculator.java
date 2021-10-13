package com.pb.shevchenko.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        int operand1 = scanner.nextInt();

        System.out.println("Enter second number");
        int operand2 = scanner.nextInt();


        System.out.println("Enter arithmetic sign");
        String arithmeticSign = scanner.next();


        switch (arithmeticSign){
            case "+":
                System.out.printf("Result: %d",operand1+operand2);
                break;
            case "-":
                System.out.printf("Result: %d",operand1-operand2);
                break;
            case "*":
                System.out.printf("Result: %d",operand1*operand2);
                break;
            case "/":
                if(operand2==0){
                    System.out.println("You can't devide by zero!");
                    break;
                }
                System.out.printf("Result: %1.1f", (double)operand1/operand2);

        }

    }
}
