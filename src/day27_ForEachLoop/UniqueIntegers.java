package day27_ForEachLoop;

public class UniqueIntegers {

    /*Task:
    1. write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4
                     */


    public static void main(String[] args) {

        int[] arr ={1,1,2,3,3,4};
        //          0,1,2,3,4,5

        for(int j=0; j<=arr.length-1; j++) {

            int element = arr[j]; // 1
            int frequency = 0; // for the frequency of element
            for (int i = 0; i <= arr.length - 1; i++) { // j: 0,1,2,3,4,5
                if (arr[i] == element) {
                    frequency++;
                }
            }//for finding the frequency of one element, by comparing it with each elements of array

            if (frequency == 1) { //verify if the element id unique
                System.out.print(element + " ");
            }
        }


    }
}