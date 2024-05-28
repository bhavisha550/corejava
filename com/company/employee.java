package com.company;

class emp{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}



public class employee {
    public static void main(String[] args) {
        emp isha = new emp();
        isha.setName("isha moghe");
        isha.salary = 7;

        System.out.println(isha.getName());
        System.out.println(isha.getSalary());




    }
}
