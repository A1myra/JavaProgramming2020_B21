package day42_Inheritance.DeviceTask;

public class Phone extends Devise {


    public static boolean canCall, canSendMessage, hasCamera, SIM;

    static{
        canCall=true;
        canSendMessage=true;
        hasCamera=true;
        SIM=true;
    }

    public Phone(String deviceName,String brand, String model, double price){
        setInfo("Phone",brand,model,price);
    }

    public void call(long number){
        System.out.println(brand+" "+model+" is calling "+number);
    }

    public void text(long number){
        System.out.println(brand+" "+model+" is texting to "+number);
    }

}
