package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {

    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Almira"); //0
        names.add("Rinat"); //1
        names.add("Dani"); //2
        names.add("Ayni"); //3
        names.add("Rinat");//4
        names.add("Hamu");//5
        names.add("Epan");//6
        names.add("Rinat");//6
        names.add("Rinat");//6


        System.out.println(names);

        names.remove(1); // remove the first rinat which is in index 1

        System.out.println(names);

        names.remove("Rinat");//remove the first rinat that is in the list

        System.out.println(names);

        names.remove(names.size()-1);//remove the last rinat that in the last index

        System.out.println(names);

        names.clear();
        System.out.println(names);
    }
}
