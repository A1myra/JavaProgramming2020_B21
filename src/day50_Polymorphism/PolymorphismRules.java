package day50_Polymorphism;

import day42_Inheritance.AnimalTask.Animal;
        import day42_Inheritance.AnimalTask.Dog;


        import day46_JavaRecap.CarTask.BMW;
        import day46_JavaRecap.CarTask.Car;
        import day46_JavaRecap.CarTask.Tesla;


public class PolymorphismRules {


    public static void main(String[] args) {
        Dog dog = new Dog("A", "Husky", 'M',  "White", "Small",12);
        dog.bark();

        Animal animal = new Dog("A", "Husky", 'M',  "White", "Small",13);
        animal.eat("Dog food");
        // animal.bark();


        System.out.println("==========================================");

        Car car = new Tesla("Tesla","Model 3", "White", 2019, 45000);
        // car.autoPilot();
        car.start();

        Car car2 = new BMW("BMW","X5", "red", 2018, 55000);
        car2.start();

        System.out.println("============================================");

        Animal animal2 = new Dog("Lucy", "Husky", 'M', "small", "White", 12);

        //  animal2.bark();


    }

}