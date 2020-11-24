package day33_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(10);
        list2.add(300);
        list2.add(1000);
        list2.add(400);

        int max =list2.get(0);
        int min =list2.get(0);

        for(int each :list2) {
           // max=Math.max(each,max) ==> same like if statement
            if (max < each) {
                max = each;
            }
            // min=Math.min(each,min)
            if (min > each) {
                min = each;
            }
        }
        /*
        regular for loop:
        for(int i=0; i<=list2.size()-1; i++){
            if(list2.get(i)>max){
                max = list2.get(i);
            }

            if(list2.get(i)<min){
                min = list2.get(i);
            }
        }

         */


        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

}
