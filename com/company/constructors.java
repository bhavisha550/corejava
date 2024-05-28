package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(String myName, int myId){   //constructor h!!!!!!!!!!!
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        String name = n;
    }
    public void setId(int i){
        int id = i;
    }
    public int getId(){
        return id;
    }
}
public class constructors {
    public static void main(String[] args) {
          MyMainEmployee isha = new MyMainEmployee("isha moghe", 5);
          System.out.println(isha.getId());
          System.out.println(isha.getName());
    }
}
