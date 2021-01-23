package day48_Abstraction.AnimalTask;

public final class Lion extends Animal implements predator{
    public Lion(String name, String breed, String size, char gender, int age) {
        super("Lion", breed, size, gender, age);
    }

    @Override
    public void sleep() {
        byte a = 10;
        int b = a;
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunts small animals");
    }
}
