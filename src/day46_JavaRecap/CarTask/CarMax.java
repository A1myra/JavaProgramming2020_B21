package day46_JavaRecap.CarTask;

public class CarMax {

    public static void main(String[] args) {
        Mercedes mercedes =new Mercedes("Mercedes","G Class","red",2021,300000);
        Lexus lexus = new Lexus("Lexus","RX 350","White",2018,20000);
        BMW bmw = new BMW("BMW", "X6","Black",2019,45000);
        Tesla tesla = new Tesla("Tesla","Model 3","Blue",2020,50000);

        mercedes.start();
        lexus.start();
        bmw.start();
        tesla.start();

        System.out.println("===========================");
        mercedes.drive();
        bmw.drive();
        lexus.drive();
        tesla.drive();

        System.out.println("===========================");
        bmw.autoPark();
        tesla.autoPilot();





    }
}
