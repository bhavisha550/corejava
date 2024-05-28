package com.company;

import java.util.Scanner;


public class heyUser {
    public static void main(String[] args) {
        System.out.println("please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println( "hello " + name + " have a good day! ");
    }
}
