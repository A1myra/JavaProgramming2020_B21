package day26_Arrays;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println(numbers); //hashcode

//Array.toString(array):
        ////must use in order to print the entire Array

        System.out.println(Arrays.toString(numbers));
        String str1="Cybertek";
        System.out.println(str1);

        String[] classMates ={"Adil","Muhammad","Yasin","Necdet","Daniel"};
        System.out.println(classMates);//hashcode
        System.out.println(Arrays.toString(classMates).replace("[","{").replace("]","}"));

//Array.sort(array):
        //sorts the array in ascending order, smallest to largest

        int[] arr1= {200000, 1000000, 4000000, 6000, 300000, 12345551, 90000};

        Arrays.sort(arr1); //does not return any value. cannot be assigned to a variable.
        System.out.println(Arrays.toString(arr1));
        System.out.println("Max: "+arr1[arr1.length-1]);
        System.out.println("Min: "+arr1[0]);


        double[] arr2= {1.5,0.5,2.5,0,3.4,1.8,10.5,20.5,-0.75,-0.5};

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Second minimum number: "+arr2[1]);
        System.out.println("Second maximum number: "+arr2[arr2.length-1-1]);


        String[] names={"Haroon", "Nurahmat","Livio","Dean","Ayah","afrooz","me"}; //A to Z
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

//equals(arr1,arr2):       return boolean
        int[] a1 ={1,2,3};
        int[] a2 ={1,2,3};

        boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1); //true

        int[] a3 ={1,2,3};
        int[] a4 ={1,3,2};
        boolean r2= Arrays.equals(a3,a4);
        System.out.println(r2); //false

        Arrays.sort(a3);//[1,2,3]
        Arrays.sort(a4);//[1,2,3]
        boolean r3= Arrays.equals(a3,a4);
        System.out.println(r3); //false








    }
}
