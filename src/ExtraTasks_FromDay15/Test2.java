package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);

        System.out.println("Please enter two integer number: ");

        int num1 = result.nextInt();
        int num2 = result.nextInt();

        int endResult = num1 * num2;
        System.out.println("result is : "+endResult);

    /*- Create a program that will take two int numbers and multiply them.
     Print in the following way:
	%numOne x %numTwo = %result
	Ex: 3,5 --> 3 x 5 = 15
	Ex: -2,30 --> -2 x 30 = -60

     */
    }
}