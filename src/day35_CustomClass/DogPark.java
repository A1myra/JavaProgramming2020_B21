package day35_CustomClass;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setInfo("Mino","York","Small",'M',
                        "Black", LocalDate.of(1999,2,23));
        dog1.getInfo();

        dog2.setInfo("Bimbo","Maltese","Large",'F',
                        "White",LocalDate.of(1997,11,17));
        dog2.getInfo();

        dog3.setInfo("Simba","German","Medium",'M',
                        "Yellow",LocalDate.of(2020,1,2));
        dog3.getInfo();

        dog1.eat("Candy");
        dog2.eat("Chicken");
        dog3.eat("Beef");

        dog1.drink("Beer");
        dog2.drink("Water");
        dog3.drink("Milk");

        Dog[] dogs  = {dog1,dog2,dog3};
        ArrayList<Dog> huskies = new ArrayList<>();
        ArrayList<Dog> Maltese = new ArrayList<>();

        for( Dog eachDog: dogs) {
            if (eachDog.breed.equalsIgnoreCase("husky")) {
                huskies.add(eachDog);
            } else if (eachDog.breed.equalsIgnoreCase("Maltese")) {
                Maltese.add(eachDog);
            }
        }

            System.out.println("Total number of Huskies: "+huskies.size());
            System.out.println("Total number of Maltese: "+Maltese.size());




    }
}
