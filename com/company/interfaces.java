package com.company;

interface Bicycle{
    int a = 445;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornK3g();
    void blowHornDhoom();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("hornnnnnnnn!!!!!!!!!!!!!!");
    }

    public void applyBreak(int decrement){
        //speed = speed - decrement;
        System.out.println("applying break");
    }
    public  void speedUp(int increment){
        //speed = speed + increment;
        System.out.println("speeding uppp");
    }
    public void blowHornK3g(){
        System.out.println("play K3g song");
    }
    public void blowHornDhoom(){
        System.out.println("play dhoom song");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle isha = new AvonCycle();
        isha.applyBreak(1);
        System.out.println(isha.a); //property can be created in interface
        // but properties cant be modified as they are final in an interface!
        isha.blowHornK3g();
        isha.blowHornDhoom();
    }
}
