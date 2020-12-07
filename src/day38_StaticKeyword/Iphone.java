package day38_StaticKeyword;

public class Iphone {

    public String model, color, storage;
    public double price;

    public static String brand = "Apple", OperatingSystem = "iOS", madeIn = "China";

    public void call(long phoneNumber) {
        System.out.println("Iphone "+model+" is calling "+phoneNumber);
    }

    public static void getInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+OperatingSystem);
        System.out.println("Made in: "+madeIn);
    }

    @Override
    public String toString() {
        return "Iphone{" +"Brand='"+brand+'\''+
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +'\''+
                ", operating system='"+OperatingSystem+'\''+
                ", storage='" + storage + '\'' +

                '}';
    }
}
