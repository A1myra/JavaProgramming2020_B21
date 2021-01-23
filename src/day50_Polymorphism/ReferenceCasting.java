package day50_Polymorphism;


import day42_Inheritance.AnimalTask.Animal;
import day42_Inheritance.AnimalTask.Cat;
import day42_Inheritance.AnimalTask.Dog;

public class ReferenceCasting {

    public static void main(String[] args) {
        //implicit casting: smaller to larger
        int a = 10;
        double b = a;

        //explicit casting: larger to smaller
        double d = 10.5;
        int c = (int)d;

        System.out.println("================================");
        //up casting: smaller reference type to the larger.
        //always done by automatically, so we don't have to worry about it.

        //down casting: larger reference type to the smaller.
        Animal animal = new Dog("A","k",'f',"white","small",12);
        Dog dog = (Dog)animal;
        dog.bark();

        Animal animal1 = new Cat("B","K",'M',"while","large",2);
        ( (Cat) animal1).meow();






    }
}
