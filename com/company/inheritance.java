package com.company;

class Base{
    Base(){
        System.out.println("base class constructor");
    }
    Base(int x){
        System.out.println("overloaded constructor with value of x as : " + x);
    }
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting x now ");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}


class Derived extends Base{
    Derived(){
        //super(0);
        System.out.println("derived class constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("overloaded derived class constructor with value y as: " + y);
    }
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("child of derived class constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("child of derived class overloaded constructor with value of z as: " + z);
    }
}

public class inheritance {
    public static void main(String[] args) {
        //com.company.Base b = new com.company.Base();

        //com.company.Derived d = new com.company.Derived(14, 9);

        ChildOfDerived c = new ChildOfDerived(12, 22, 82);

    }
}
