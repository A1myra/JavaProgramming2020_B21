package day34_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        // containAll
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

        //verify is 10 is contained in the list
        boolean r1 = list.contains(10);

        //verify if 10,30,50,60 all are contained in the list
        boolean r2 = list.contains(10) && list.contains(30) && list.contains(50)&& list.contains(60);

        System.out.println("r1 = " + r1);//true
        System.out.println("r2 = " + r2);//false

        //verify if 10,30,50,60 all are contained in the list
        boolean r3 = list.containsAll(Arrays.asList(10,30,50,60));
        System.out.println("r3 = " + r3);

        ArrayList<String> group1 = new ArrayList<>();
        group1.add("Mohammad");
        group1.add("Almira");
        group1.add("Rinat");
        group1.add("Ayni");
        group1.add("Dani");

        //ayni, dani, biden

        boolean r5 = group1.containsAll(Arrays.asList("Ayni","Dani","Biden"));
        System.out.println("r5 = " + r5);

        //Mohammed, Ayni, Rinat
        boolean r6 = group1.containsAll(Arrays.asList("Mohammad","Ayni","Rinat"));
        System.out.println("r6 = " + r6);

        System.out.println("============================================");
        //addAll

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList ('A','Z','C','B','H','I','K') );

        System.out.println(chars);

        String[] names = { "Almira","Rinat","Ayni","Dani","Epan","Bimbo","Mino"};
        ArrayList<String> student = new ArrayList<>(Arrays.asList(names));
        // same as above ==> student.addAll(Arrays.asList(names));
        System.out.println(student);


        ArrayList<Character> ch1 = new ArrayList<>(Arrays.asList('A','B','C','D','e'));
        ch1.addAll(Arrays.asList('J','K','L'));

        System.out.println(Arrays.asList(ch1));

        System.out.println("============================================");

        ArrayList<String> group2 = new ArrayList<>();
        group2.addAll(Arrays.asList(names));

        System.out.println(group2);
        group2.remove("Rinat");
        group2.remove("Dani");
        System.out.println(group2);

        group2.removeAll(Arrays.asList("Bimbo","Mino"));
        System.out.println(group2);

        System.out.println("============================================");

        ArrayList<String> employee = new ArrayList<>();
        //remove all the names called ahmed
        employee.addAll(Arrays.asList("Ahmed","Ahmed","Almira","Ahmed","Ahmed","Rinat","Ahmed"));
        employee.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employee);

        System.out.println("============================================");
//retainAll
        ArrayList<String>employee2 = new ArrayList<>();
        employee2.addAll(Arrays.asList("Ahmed","Ahmed","Almira","Ahmed","Ahmed","Rinat","Ahmed"));

        System.out.println(employee2);

        employee2.retainAll(Arrays.asList("Ahmed"));
        System.out.println(employee2);




    }
}
