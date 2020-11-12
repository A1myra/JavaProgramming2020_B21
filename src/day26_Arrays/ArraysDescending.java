package day26_Arrays;

import java.util.Arrays;

public class ArraysDescending {

    public static void main(String[] args) {

        int[] arr = {5, 1, 2, 6, 7, 0};

        Arrays.sort(arr); //finish sorting in ascending order

        System.out.println(Arrays.toString(arr)); //[0, 1, 2, 5, 6, 7]
        //                                           0, 1, 2, 3, 4, 5

        int[]descending = new int[arr.length];//size [7,6,5,2,1,0]

        for (int i = arr.length-1, j=0; i >= 0; i--,j++) { //i:5,4,3,2,1,
            //   lastIndexNum //because large to small
            //System.out.print(arr[i]+" ");
            descending[j]=arr[i];
            /*
                       j       i
            descending[0]= arr[5]=7;
            descending[1]= arr[4]=6;
            descending[2]= arr[3]=5;
            descending[3]= arr[2]=2;
            descending[4]= arr[1]=1;
            descending[5]= arr[0]=0;
            it is like looking array1 one at a mirror to see array 2
            这个的前1=这个的后1
            这个的前2=这个的后2...
             */

        }

        System.out.println(Arrays.toString(descending));
    }
}