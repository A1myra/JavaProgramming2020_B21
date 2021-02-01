package day52_Collection;

import java.util.*;

public class CollectionIntro {

    public static void main(String[] args) {

        Collection<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Size of the collection: "+numbers.size());

        numbers.add(100);
        System.out.println("Size of the collection: "+numbers.size());

        numbers.addAll(Arrays.asList(200,300,400,500));
        System.out.println("Size of the collection: "+numbers.size());

        numbers.removeAll(Arrays.asList(100,400));
        System.out.println("Size of the collection: "+numbers.size());

        System.out.println(numbers);

        System.out.println(  ((ArrayList)numbers).get(0));
        //to use get method, we need to cast it to the arrayList, because Arraylist have get method.

        //System.out.println((LinkedList)numbers.)get(0);
        //remember: Arraylist can not be casted to LinkedList, because they are not is relation.

        Collection<String> names = new LinkedHashSet<>();
        Collection<Integer>scores = new LinkedList<>();


    }
}
