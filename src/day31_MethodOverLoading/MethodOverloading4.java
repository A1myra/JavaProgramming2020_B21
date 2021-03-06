package day31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverloading4 {

    public static void main(String[] args) {
        int[] arr = { 1,4,3,2,7,0,10,11,9,8};

        arr=sort(arr);
        System.out.println(Arrays.toString(arr));

        double[] arr2 = { 5.5, 6.5, 10.5, 11.5, 12.5, 3.5, 4.5};
        arr2=sort(arr2);
        System.out.println(Arrays.toString(arr2));

        char[] arr3={'a', 'b', 'c', 'd', 'f'};
        arr3=sort(arr3);
        System.out.println(Arrays.toString(arr3));

        String[] arr4={"A","B","C","D","E"};
        arr4=sort(arr4);
        System.out.println(Arrays.toString(arr4));
    }

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

/*
sort: sorts in descending order
    int[]
    double[]
    char[]
    String[]
 */
