package com.company;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 for rock, 1 for paper, 2 for scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("DRAW");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("YOU WIN:):):):)");
        }
        else {
            System.out.println("YOU LOSE:(:(:(:(");
        }
        System.out.println("computer choice " + computerInput);

    }
}