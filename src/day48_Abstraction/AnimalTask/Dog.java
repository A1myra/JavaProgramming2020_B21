package day48_Abstraction.AnimalTask;

public final class Dog extends Animal implements playable,Swimable{

    public Dog(String name, String breed, String size, char gender, int age) {
        super("Dog", breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps 8 hours");
    }

    @Override
   public void play(){
       System.out.println("Dogs play with ball");
    }

    @Override
    public void swim(){
        System.out.println("Dogs can swim 1 hour");
    }

}
