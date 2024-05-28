package com.company;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("the pen writes");
    }
    public void refill(){
        System.out.println("change refill");
    }
    void changeNib(){
        System.out.println("nib changed");
    }
}
public class station {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.changeNib();
    }
}
