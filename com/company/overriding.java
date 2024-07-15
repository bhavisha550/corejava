package com.company;

class A {
    public void meth1() {
        System.out.println("meth1 of com.company.A");
    }

    public void meth2() {
        System.out.println("meth2 of com.company.A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("meth2 of com.company.B");
    }
}


public class overriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.meth2();
        a.meth2();
    }
}
