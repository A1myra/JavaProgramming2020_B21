package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMethods {

    public static void main(String[] args) {

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(200);
        list1.add(300);

        list1.set(1,400);

        System.out.println(list1);

        ArrayList<String>names= new ArrayList<>();
        names.add("Almira");
        names.add("Rinat");
        names.add("Ayni");
        names.add("Umut");
        names.add("Dani");
        names.add("Epan");
        names.add("Hamu");

        System.out.println(names);

        names.set(3,"Halimiyan"); //replace umut to halimiyan
        System.out.println(names);

//just like this for arrays:  example
        int[] arr= {10,20,30,40};
        arr[1]=200;
        System.out.println(Arrays.toString(arr));

//remove(index):
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println(list);

        list.remove(2); // will remove C.
        System.out.println(list);
        list.remove(2); //will remove D
        System.out.println(list);

//remove(object):
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        //Character ch = 'C';
        boolean r1 =  list2.remove(Character.valueOf('C'));

        System.out.println(list2);
        System.out.println(r1); // if remove is successful it will return true.


    }
}
