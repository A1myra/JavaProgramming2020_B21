package day42_Inheritance.DeviceTask;

public class deviceObjects {

    public static void main(String[] args) {

        TV tv = new TV("TV","Samsung","LX32",499.99);

        System.out.println(tv);
        tv.turnOn();
        tv.channelUp();
        tv.channelDown();
        tv.turnOff();

        Phone iphone = new Phone("Phone","Iphone","12 Pro",1200);

        System.out.println(iphone);
        iphone.turnOn();
        iphone.call(571323232);
        iphone.text(571323232);
        iphone.turnOff();
    }




}
