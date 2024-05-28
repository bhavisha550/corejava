package com.company;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("my name is " + name);
        System.out.println("my id is " + id);
    }
}

public class customClass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee isha = new Employee(); //new object
        Employee honey = new Employee();
        //setting properties
        isha.id = 05;
        honey.id = 06;
        isha.name = "isha moghe";
        honey.name = "honey chopra";
        isha.printDetails();
        honey.printDetails();
    }
}
