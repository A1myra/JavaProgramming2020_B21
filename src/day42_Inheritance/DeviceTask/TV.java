package day42_Inheritance.DeviceTask;

public class TV extends Devise {

    public TV(String deviceName,String brand, String model, double price){
        setInfo("TV", brand, model, price);
    }


    public static boolean hasChannel, hasCabel;
    static{
        hasChannel=true;
        hasCabel=true;
    }

    public void channelUp(){
        System.out.println("Channel Up "+brand+" "+model);
    }

    public void channelDown(){
        System.out.println("Channel Down "+brand+" "+model);
    }


}
