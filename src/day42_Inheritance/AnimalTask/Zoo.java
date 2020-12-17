package day42_Inheritance.AnimalTask;

public class Zoo { // Zoo HAS A Tiger

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Rinat", "Tiger", 'M', "Orange", "Big", 5);

        System.out.println(tiger);
        tiger.eat("Chicken");
        tiger.drink("Water");
        tiger.hunt();
        tiger.roar();

        Cat cat = new Cat("Bimbo","Saemes",'F',"Grey","Small",1);

        System.out.println(cat);
        cat.eat("Tuna");
        cat.drink("Milk");
        cat.sleep();
        cat.meow();

        Dog dog = new Dog("Modi","German",'F',"Black","Big",2);

        System.out.println(dog);
        dog.eat("chicken");
        dog.eat("water");
        dog.sleep();
        dog.bark();
    }
}