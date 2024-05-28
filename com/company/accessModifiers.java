package com.company;

class MyEmployee{
    private int id;
    private String name;
    public String getName(){

        return name;
    }
    public void setName(String n){

        name = n;
    }
    public int getId(){

        return id;
    }
    public void setId(int i){

        id = i;
    }
}
public class accessModifiers {
    public static void main(String[] args) {
        MyEmployee isha = new MyEmployee();
        isha.setName("isha moghe");
        isha.setId(55);
        System.out.println(isha.getName());
        System.out.println(isha.getId());
    }
}
