package com.company;

public class firstSumN {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        int i = 1;
        while(i<n)
        {
            sum = sum + (2*i);
            i++;
        }
        System.out.print(sum);
    }
}
