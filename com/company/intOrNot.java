package com.company;

import java.util.Scanner;


public class intOrNot {
    public static void main(String[] args) {
        System.out.println("please enter your number: ");
        Scanner sc = new Scanner(System.in);

        System.out.println(sc.hasNextInt());
    }
}

