package com.company;

class Phone{
    public void showTime(){
        System.out.println("time is 8:00 am");
    }
    public void on(){
        System.out.println("turning on phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music...");
    }
    public void on(){
        System.out.println("turning on smart phone!!");
    }
}
public class dynamicMeth {
    public static void main(String[] args) {
        //com.company.Phone obj = new com.company.Phone();
        //com.company.SmartPhone smobj = new com.company.SmartPhone();
        //obj.name();

        Phone obj = new SmartPhone();
        obj.showTime();
        
        obj.on();
    }
}
