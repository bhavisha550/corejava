package com.company;

interface MyCamera{
    private void slomo(){
        System.out.println("recording slomo vdo");
    }
    void takeSnap();
    void recordVideo();
    default void record4Kvideo(){
        slomo();
        System.out.println("recording in good quality");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling....." + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting.....");
    }

}

class MySmartPhone2 extends MyCellPhone implements MyWifi, MyCamera{
    @Override
    public void takeSnap() {
        System.out.println("click...");
    }

    @Override
    public void recordVideo() {
        System.out.println("start........stop");
    }


    @Override
    public String[] getNetworks() {
        System.out.println("getting list of networks");
        String[] networkList = {"isha", "moghe", "yeahhh22"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to " + network);
    }
}

public class poly {
    public static void main(String[] args) {
        MyCamera cam = new MySmartPhone2();
        //cam.getNetwortks();  //not allowed!!!!
        cam.record4Kvideo();
    }
}
