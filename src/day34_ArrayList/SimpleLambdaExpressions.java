package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class SimpleLambdaExpressions {

    public static void main(String[] args) {
        //Predicate
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));

       /* for(int i=0; i<=numbers.size()-1; i++){
            if(numbers.get(i) < 5){
                numbers.remove((i)); // remove all the numbers that is less than 5
            }
        }
        remove and remove all methods doesn't work
        */

        //removeIf
        System.out.println(numbers);

        Predicate<Integer>lessThan5 = each -> each < 5 ;
        numbers.removeIf(lessThan5);
        System.out.println(numbers);


        System.out.println("========================================================");
        ArrayList<Integer>numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6));

        numbers2.removeIf(p -> p<7); // remove if the element is small than 7
        //p is element

        System.out.println(numbers2);

        System.out.println("========================================================");

        ArrayList<Integer>scores = new ArrayList<>();
        scores.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));

        scores.removeIf(p -> p%3==0 || p%5==0); //remove if the element is divisible by 3
        System.out.println(scores);

        System.out.println("========================================================");

        ArrayList<String>employee2 = new ArrayList<>();
        employee2.addAll(Arrays.asList("Ahmed","Ahmed","Almira","Ahmed","Ahmed","Rinat","Ahmed","Adil"));
        System.out.println(employee2);

        employee2.removeIf(p -> p.startsWith("A") && !p.equals("Ahmed"));
        //remove all names starts with A but Ahmed.
            System.out.println(employee2);

        System.out.println("========================================================");
        ArrayList<String>employee3 = new ArrayList<>();
        employee3.addAll(Arrays.asList("Ahmed","Ahmed","Almira","Ahmed","Ahmed","Rinat","Rinat","Ahmed","Adil"));
        System.out.println(employee3);

        employee3.removeIf(p -> p.toLowerCase().contains("a") && p.toLowerCase().contains("r"));
        System.out.println(employee3);



    }




    }


