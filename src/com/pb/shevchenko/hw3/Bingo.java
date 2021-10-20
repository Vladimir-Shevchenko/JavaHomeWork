package com.pb.shevchenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(101);
        System.out.println("Guess number between 0 and 100");
        System.out.println("In order finish game input 101");

        Scanner scanner = new Scanner(System.in);

        while (true){
            int input = scanner.nextInt();

            if(input == 101){
                System.out.println("GAME OVER");
                break;
            }

            if (input>random){
                System.out.println("Number is lower than yours");
            } else if(input<random){ System.out.println("Number is higher than yours");
            }else {
                System.out.println("You right guessed the number");
                break;}


        }
    }
}
