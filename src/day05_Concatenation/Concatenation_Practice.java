package day05_Concatenation;

public class Concatenation_Practice {
    public static void main(String[] args) {


        int houseNumber = 7925;
        String streetName = "John Branch  Dr";
        String cityName = "McLean";
        String state = "VA";
        int zipCode = 22000;

        String fullAddress = houseNumber + " " + streetName + "\n" + cityName + " "+ state+ ", " + zipCode; //concatination

        System.out.println(fullAddress);

        System.out.println("===========================================");

        String brand = "BMW";
        String model = "X7";
        int year = 2020;
        int mileage = 55000; // use short if it is small mileage like 20000
        double price = 25000;
        String color = "Red";

        // 2010 Toyota Camry, 55000 miles, Red, $18000

        String carInfo = year+" "+ brand + " "+ model+", "+ mileage+" miles, "+color+", $"+price; // concatonation

        System.out.println(carInfo);

    }
}
