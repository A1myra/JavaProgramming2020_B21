package day26_Arrays;

import java.util.Scanner;

public class MinMaxInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length=scan.nextInt();

        int[] numbers = new int[length];

        for(int i=0; i <= length-1; i++){ //gets the user input and stores into the array starting from index
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
        }

        int min= numbers[0]; //think that first number is min,and compare it with other
        int max= numbers[0]; //same like above

        for(int i=0; i<=length-1; i++){
            if(numbers[i]<min){
                min=numbers[i];
            }

            if(numbers[i]>max){
                min=numbers[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
