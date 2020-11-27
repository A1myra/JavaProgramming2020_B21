package library;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {
    /*
    return the maximum number from an array of integer
     */
    public static int max(int[] arr){
        int max =arr[0];
        for( int each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }


    /*
   return the maximum number from an array of double
    */
    public static double max(double[] arr){
        double max=arr[0];
        for(double each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }


    /*
    returns the minimum number from an array of integer
     */
    public static int min(int[] arr){
        int min = arr[0];

        for(int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }


    /*
    returns the minimum number from an array of double
     */
    public static double min(double[] arr){
        double min = arr[0];

        for(double each : arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }


    /*
    Combines two arrays of integers and return the new array
     */
    public static int[] combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];
        int i = 0;

        for(int each : arr1){
            arr3[i++] = each;
        }

        for(int each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }


    /*
    Combines two arrays of double and return the new array
     */
    public static double[] combineTwoArrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length+arr2.length];
        int i = 0;

        for(double each : arr1){
            arr3[i++] = each;
        }

        for(double each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }


    /*
    Combines two arrays of char and return the new array
     */
    public static char[] combineTwoArrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length+arr2.length];
        int i = 0;

        for(char each : arr1){
            arr3[i++] = each;
        }

        for(char each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }


    /*
    Combines two arrays of String and return the new array
     */
    public static String[] combineTwoArrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];
        int i = 0;

        for(String each : arr1){
            arr3[i++] = each;
        }

        for(String each : arr2){
            arr3[i++]  = each;
        }

        return arr3;
    }


    /*
    sorts the array of integers in descending order. and returns it as an array
     */
    public static int[] sort(int[] arr){  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        int[] reversedArray = new int[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    } //sort in descending order


    /* /*
    sorts the array of double in descending order. and returns it as an array
     */
    public static double[] sort(double[] arr){
        Arrays.sort(arr);
        double[] reversedArray = new double[arr.length];

        for(int i = arr.length-1,  j=0; i>=0; i--, j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }


     /*
    sorts the array of char in descending order. and returns it as an array
     */
    public static char[] sort(char[] arr){
        Arrays.sort(arr);
        char[] reversedArray = new char[arr.length];

        for(int i = arr.length-1,  j=0; i>=0; i--, j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }


     /*
    sorts the array of String in descending order. and returns it as an array
     */
    public static String[] sort(String[] arr){
        Arrays.sort(arr);
        String[] reversedArray = new String[arr.length];

        for(int i = arr.length-1,  j=0; i>=0; i--, j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }


    /*
    replace the [] with {} while printing the array
     */
    public static String printArray(int[] arr){
        String str = Arrays.toString(arr);
        str = str.replace("[","{").replace("]","}");
        return str;
    }


    /*
        adds element to the integer array
     */
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


    /*
        adds element to the double array
     */
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


    /*
       adds element to the char array
     */
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


    /*
       adds element to the String array
    */
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


    /*
    revers an array of int and returns it
     */
    public static int[] reverse(int[] arr) { //because return array at the end, so added [] after int
        // arrays must be given in order to reverse it
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { //i:index number of arr in reversed order
            reverse[j] = arr[i];//j: index numbers of reverse array, in natural order
        }
        return reverse;

    }


    /*
    revers an array of double and returns it
     */
    public static double[] reverse(double[] arr) { //because return array at the end, so added [] after int
        // arrays must be given in order to reverse it
        double[] reverse = new double[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { //i:index number of arr in reversed order
            reverse[j] = arr[i];//j: index numbers of reverse array, in natural order
        }
        return reverse;

    }


    /*
    revers an array of char and returns it
     */
    public static char[] reverse(char[] arr) { //because return array at the end, so added [] after int
        // arrays must be given in order to reverse it
        char[] reverse = new char[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { //i:index number of arr in reversed order
            reverse[j] = arr[i];//j: index numbers of reverse array, in natural order
        }
        return reverse;
    }


    /*
    revers an array of String and returns it
     */
    public static String[] reverse(String[] arr) { //because return array at the end, so added [] after int
        // arrays must be given in order to reverse it
        String[] reverse = new String[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) { //i:index number of arr in reversed order
            reverse[j] = arr[i];//j: index numbers of reverse array, in natural order
        }
        return reverse;
    }


    /*
        removes the duplicates from an array of int and returns it
     */
    public static int[] removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for (int each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        int[] nonDup = new int[list.size()]; // [1,2,3,4]

        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }


    /*
            removes the duplicates from an array of double and returns it
     */
    public static double[] removeDuplicates(double[] arr) {
        ArrayList<Double> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for (double each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        double[] nonDup = new double[list.size()]; // [1,2,3,4]

        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }


    /*
            removes the duplicates from an array of char and returns it
     */
    public static char[] removeDuplicates(char[] arr) {
        ArrayList<Character> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for (char each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        char[] nonDup = new char[list.size()]; // [1,2,3,4]

        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }


    /*
            removes the duplicates from an array of String and returns it
     */
    public static String[] removeDuplicates(String[] arr) {
        ArrayList<String> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for (String each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        String[] nonDup = new String[list.size()]; // [1,2,3,4]

        for (int i = 0; i <= nonDup.length - 1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }





}

