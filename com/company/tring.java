package com.company;

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelePhone{
    void camera(){
        System.out.println("click");
    }
    public void ring(){
        System.out.println("com.company.tring com.company.tring");
    }
    public void lift(){
        System.out.println("pick up phone");
    }
    public void disconnect(){
        System.out.println("cut!!!!!!!!!");
    }
}

public class tring {
    public static void main(String[] args) {
        TelePhone tp = new SmartTelephone();
        tp.disconnect();
        tp.lift();
        tp.ring();
        //tp.camera(); not allowed! pollymorphism
    }
}
