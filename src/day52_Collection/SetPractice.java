package day52_Collection;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        Set<String> names1 = new HashSet<>();
        names1.addAll(Arrays.asList("Rinat","Amir","Bimbo","Cara","Dina","Dina","Dina"));
        System.out.println(names1);

        Set<String> name2 = new LinkedHashSet<>(); //keep order,
        name2.addAll(Arrays.asList("Rinat","Amir","Bimbo","Cara","Dina","Dina","Dina"));
        System.out.println(name2);

        Set<String> name3 = new TreeSet<>();
        name3.addAll(Arrays.asList("Rinat","Amir","Bimbo","Cara","Dina","Dina","Dina"));
        System.out.println(name3);

        System.out.println("=============================================");
        String str = "aaaabbcccccbbbbgggeeeeeff"; //abcdgef
        String result = "";
        //return as array:
        //LinkedHashSet hs = new LinkedHashSet<>(Arrays.asList(str.split("")));

        //return as String:
        for(String s : new LinkedHashSet<>(Arrays.asList(str.split(""))) ){
            result+=s;
        }


        System.out.println("=============================================");

        String str1 = "silent";
        String str2 = "listen";

        String s1 = new TreeSet<>(Arrays.asList( str1.split("")) ).toString();
        String s2 = new TreeSet<>(Arrays.asList( str2.split("")) ).toString();

        //after sort it and remove the duplicates, we can check if it is anagram or not, now print it out
        System.out.println(s1.equals(s2));

        System.out.println("=============================================");


        //Null key:

       // System.out.println(str3);

        //System.out.println(str3.toUpperCase());

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(null,null,null,null));

        System.out.println(hashSet);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(null,null,null,null));

        System.out.println(linkedHashSet);


        TreeSet<Integer> treeSet = new TreeSet<>(); // we are not able to add null keyword to treeSet.
        //treeSet.addAll(Arrays.asList(null,null,null,null));
       // System.out.println(treeSet);


        /*String str4 = null;
        System.out.println(str4.equals("Muhtar"));
         */

        System.out.println("=============================================");

        Set<Integer> numbers = new HashSet<>();
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int maxNum = Collections.max(numbers);
        int minNum = Collections.min(numbers);

        //Collections.sort(numbers);
        //Collections.swap(numbers,10,1);

        Collections.frequency(numbers, 5);

        System.out.println("maxNum = " + maxNum);
        System.out.println("minNum = " + minNum);


        System.out.println("=============================================");

        /*
        dddaaaaccbb

                dacb

        output:
            d3a4c2b2
         */





    }
}
