package day22_JavaRecap;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        /*Scanner object: 1
        min:1

        "Enter a number": 5
        scan.nextInt(): 5
        comparing: 5

        "Minimum number is: ..": 1

         */
      Scanner scan=new Scanner(System.in);//object
      int min = 999999999;//possible largest int number.

        for(int i=1; i<=5; i++) {

            System.out.println("Enter a number: ");
            int n = scan.nextInt();

            if (n < min) { //comparing
                min = n;
            }
        }
scan.close();
            System.out.println("min = " + min);






    }
}
