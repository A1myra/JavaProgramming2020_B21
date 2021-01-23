package day50_Polymorphism;

import day50_Polymorphism.phoneTask.Iphone;
import day50_Polymorphism.phoneTask.Samsung;
import day50_Polymorphism.phoneTask.phone;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismIntro {

    public static void main(String[] args) {

        // Iphone iphone1= new Iphone("Apple","Iphone 12","Small","Black",1000);

        // Samsung samsung1= new Samsung("Samsung","Galaxy S20","Medium","White",900);

        phone phone1 = new Samsung("Samsung","Galaxy S20","Small","White",900);

        phone phone2 = new Iphone("Apple","Iphone 12","Medium","Black",1000);

        ArrayList<phone>phones = new ArrayList<>();
        phones.add(new Iphone("Apple","Iphone 12","Small","Black",1000));
        phones.add(new Samsung("Samsung","Galaxy S20","Small","White",900));


       // List<Integer> list = new ArrayList<>();






    }
}
