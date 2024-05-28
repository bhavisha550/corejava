package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("constructor of parent class");
    }
    public void sayHello(){
        System.out.println("hello isha");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    public void greet2(){
        System.out.println("good afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("i am ok");
    }
}

public class abstractt {
    public static void main(String[] args) {
        //com.company.Parent p = new com.company.Parent();  ---not possible
        Child c = new Child();
        c.greet();
        c.greet2();
        c.sayHello();

        // com.company.Child2 c2 = new com.company.Child2();  ---not possible
    }
}