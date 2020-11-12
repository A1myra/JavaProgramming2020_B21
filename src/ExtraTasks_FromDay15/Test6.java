package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {

        /*- Ask user to enter three numbers. Print the biggest number from the entered numbers
	Ex:
	Input: 3,6,4
	Output: The biggest number from 3,6, 4 is 6
         */

        Scanner result = new Scanner(System.in);
        System.out.println("Please enter three number");
        int num1 = result.nextInt();
        int num2 = result.nextInt();
        int num3 = result.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The biggest number from "+num1+","+num2+","+num3+" is "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("The biggest number from "+num1+","+num2+","+num3+" is "+num2);
        }else{
            System.out.println("The biggest number from "+num1+","+num2+","+num3+" is "+num3);
        }


    }
}
