package day27_ForEachLoop;

import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length+arr2.length]; // the array MUST have the capacity to contain first and second array elements
        int j = 0; // represents teh index numbers of the third array

        for(int each : arr1){  // each: 1 2 3 4
            arr3[j++]=each;
            /*
            arr3[0] = 1;
            arr3[1] = 2;
            arr3[2] = 3;
            arr3[3] = 4;
             */
        }

        for(int each : arr2){ // each: 5 6 7
            arr3[j++]=each;
            /*
            arr3[4] = 5;
            arr3[5] = 6;
            arr3[6] = 7;
             */
        }

        System.out.println(Arrays.toString(arr3));
    }
}
