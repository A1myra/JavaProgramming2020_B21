package day29_Methods;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {

        int[] arr={10,20,30,40};
        addElements(arr,50);

        int[] arr2 ={1,2,3,4,5,6};
        addElements(arr2,10);

    }


                                    //{1,2,3}    4
    public static void addElements(int[] arr, int num){
        int[] result = new int[arr.length+1];//result should be 4 if original array is 3.

        for(int i=0; i<=arr.length-1; i++){
            result[i] = arr[i]; //result == original
        }

        result[result.length-1] = num; //last number of the result is new num

        System.out.println(Arrays.toString(result));


    }


}
