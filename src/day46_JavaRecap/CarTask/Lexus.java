package day46_JavaRecap.CarTask;

public final class Lexus extends Car {

    public Lexus(String brand, String model, String color, int year, double price) {
        super("Lexus", model, color, year, price);
    }

    public void start() {
        System.out.println("Starting "+brand+" "+model+" by inserting teh key");
    }


}
