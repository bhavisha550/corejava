//package com.company;
package company;

class Person {
    public void work(){
        System.out.println("person is working");
    }
}

class Patient extends Person {
    public void work(){
        super.work();
        System.out.println("patient iss working");
    }
}

public class Superrr {
    public static void main(String[] args) {
        Person p = new Patient();
        p.work();
    }
}