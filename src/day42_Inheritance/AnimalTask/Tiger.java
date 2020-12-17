package day42_Inheritance.AnimalTask;

public class Tiger extends Animal {

    public Tiger(String name, String breed, char gender, String color, String size, int age){
        setInfo(name, breed, gender, color, size, age);
    }

    public void hunt(){
        System.out.println(name+" is hunting");
    }

    public void roar(){
        System.out.println(name+" is roaring");
    }
}
