package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {



    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,2,3,3,3,3,4,4,5,6,7,8,8,9,10));
        numbers.removeIf(p -> Collections.frequency(numbers, p) > 1);

        System.out.println(numbers);

        System.out.println("=============================================");


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("almira","almira","rinat","amira"));
        names.removeIf(p -> Collections.frequency(names, p) > 1);

        String result = names.toString().replace(", ","").substring(1).replace("]","");
        System.out.println(result);



        System.out.println("=============================================");
        ArrayList<Character>chars = new ArrayList<>();
        chars.addAll( Arrays.asList('a','1','b','2','c','d','%','$'));

        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
       // chars.removeIf(p -> Character.isLetter(p));
        System.out.println(chars);


    }
}
//      1.Write a program that find the unique names from an arrayList of string
//      DO NOT USE ANY LOOPS

//      2.Write a program that can remove the digits and letters from an array list of characters
//      DO NOT USE ANY LOOPS