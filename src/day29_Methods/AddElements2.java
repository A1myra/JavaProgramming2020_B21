package day29_Methods;

import java.util.Arrays;

public class AddElements2 {

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7};

        addElements(arr1,arr2);
    }

    public static void addElements(int[] arr1, int[] arr2){
        int[] result = new int [arr1.length+arr2.length];
        for(int i=0; i<=arr1.length-1; i++){
            result[i]=arr1[i];
        }

        for(int i=0; i<=arr2.length-1; i++){
            result[arr1.length+i]=arr2[i];
        }

        System.out.println(Arrays.toString(result));
    }

}
/*arr1 = {1,2,3,4}
        arr2 ={5,6,7}
        {1,2,3,4,5,6,7}
 */
