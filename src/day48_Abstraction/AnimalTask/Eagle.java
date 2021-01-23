package day48_Abstraction.AnimalTask;

public final class Eagle extends Animal implements predator,flyable{

    public Eagle(String name, String breed, String size, char gender, int age) {
        super("Eagle", breed, size, gender, age);
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleeps 6 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle hunts snake");
    }

    @Override
    public void fly() {
        System.out.println("Eagel can fly long hours");
    }
}
