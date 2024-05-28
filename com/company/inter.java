package com.company;

interface Camera{
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

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling....." + phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting.....");
    }

}

class MySmartPhone extends CellPhone implements Wifi, Camera{
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

public class inter {
    public static void main(String[] args) {
        MySmartPhone sp = new MySmartPhone();
        sp.record4Kvideo();
        String[] ar = sp.getNetworks();
        for (String item:        ar)
        {
            System.out.println(item);
        }
    }

}
