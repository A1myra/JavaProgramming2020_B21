package day28_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2};
        //            0 1

        int[] arr2 = {3,4,5,6,7};
        //            0 1 2 3 4

        int[] arr3 = {8,9,10,11,12,13};
        //            0 1  2  3  4  5

        int[][] arrays = {arr1,arr2,arr3};
        //                 0     1    2

        //  retrieve the element : 6
        System.out.println(arrays[1][3]);
                            // arr2  6

        //  retrieve the element : 6
        System.out.println(arrays[2][0]);

        //retrieve the elements : {3,4,5,6,7}
        System.out.println(Arrays.toString( arrays[1] ) );

        //print entire arrays:
        System.out.println(Arrays.toString(arrays)); // used for single dimensional arrays
        System.out.println(Arrays.deepToString(arrays)); // used for multi dimensional arrays

        System.out.println("==================================================");

        String[][] batch21 = {  {"lily","lana","igor"  } , //0
                { "Polina", "Serhii", "Abdujilil", "Aziz", "Halzat" } , //1
                 {"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvanch"}  };//2


        for(int i=0; i<=batch21.length-1; i++) { //i: each group
            System.out.println(Arrays.toString(batch21[i]));

            for (int j = 0; j <= batch21[i].length - 1; j++) { //j: each member
                System.out.println(batch21[i][j]);
            }
        }
            System.out.println("===================================================");

            for(int i = batch21.length-1; i >= 0 ; i-- ){ // i: 2, 1, 0    represents the index num of 1D arrays

                for(int j = batch21[i].length-1;  j >=0; j-- ){ // j: represents the index of elements
                    System.out.print( batch21[i][j] +"  "  );
                }

            }


        }

}
