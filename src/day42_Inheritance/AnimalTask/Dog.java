package day42_Inheritance.AnimalTask;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, String color, String size, int age){
        setInfo(name, breed, gender, color, size, age);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }
}


