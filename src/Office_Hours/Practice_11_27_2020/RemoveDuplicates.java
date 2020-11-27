package Office_Hours.Practice_11_27_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4}; //expected result: [1,2,3,4]

        ArrayList<Integer> list = new ArrayList<>();

        for(int each:arr){
            if(list.contains(each)){
                continue;
            }
            list.add(each);
        }
        System.out.println(list);

    }
}
