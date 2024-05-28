package com.company;

import java.util.Scanner;

public class marksPercent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter subject1: ");
        int eng = sc.nextInt();
        System.out.print("enter subject2: ");
        int math = sc.nextInt();
        System.out.print("enter subject3: ");
        int sci = sc.nextInt();
        System.out.print("enter subject4: ");
        int hin = sc.nextInt();
        System.out.print("enter subject5: ");
        int so = sc.nextInt();

        float per = ((eng + math + sci + hin + so)/500.0f)*100;
        System.out.println("percentage obtained : ");
        System.out.println(per);

    }


}
