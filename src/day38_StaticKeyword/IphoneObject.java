package day38_StaticKeyword;

public class IphoneObject {

    public static void main(String[] args) {

        Iphone phone1 = new Iphone();

        Iphone phone2 = new Iphone();

        Iphone phone3 = new Iphone();

        Iphone phone4 = new Iphone();

        //phone1.OperatingSystem = "Android";

        System.out.println(phone1.OperatingSystem);
        System.out.println(phone2.OperatingSystem);
        System.out.println(phone3.OperatingSystem);
        System.out.println(phone4.OperatingSystem);

        System.out.println("===================================================");
        Iphone.getInfo();

    }
}
