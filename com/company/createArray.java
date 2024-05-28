package com.company;

public class createArray {
    public static void main(String[] args) {
        float [] arr = {1.5f, 5.5f, 2.5f, 4.5f, 3.0f};
        float sum = 0;
        for(float i:arr)
        {

            sum = sum + i;

        }
        System.out.println(sum);
    }
}
