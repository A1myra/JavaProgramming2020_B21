package day42_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, String color, String size, int age){
        setInfo(name, breed, gender, color, size, age);
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }

}
