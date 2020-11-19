package day31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverloading4 {

    public static int[] sort(int[] arr) {  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        int[] reversedArray = new int[arr.length];  // {3, 2, 1}

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }

    public static double[] sort(double[] arr){
        Arrays.sort(arr);
        double[] reversedArray = new double[arr.length];

        for(int i = arr.length-1,  j=0; i>=0; i--, j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }

    public static char[] sort(char[] arr){
        Arrays.sort(arr);
        char[] reversedArray = new char[arr.length];

        for(int i = arr.length-1,  j=0; i>=0; i--, j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }

    public static String[] sort(String[] arr){
        Arrays.sort(arr);
        String[] reversedArray = new String[arr.length];

        for(int i = arr.length-1,  j=0; i>=0; i--, j++){
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }
}
