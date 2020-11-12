package day16_Scanner;

import java.util.Scanner;

public class DynamicCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// make the scanner object

        System.out.println("Please enter two numbers and an operator");
        System.out.println("Enter number one: ");
        double number1 = input.nextDouble();//accepting the first number

        System.out.println("Enter number two: ");
        double number2 = input.nextDouble();//accepting the second number

        System.out.println("Enter the operator: ");
        String operator = input.next();//accepting the operation

        input.close();//closing the scanner because we have all the inputs.

        double result = 0;
        boolean isValid = true;
        switch (operator){
            case"+":
                result=number1 + number2;
                break;
            case"-":
                result=number1 - number2;
                break;
            case"x":
            case"*":
                result=number1 * number2;
                break;
            case"/":
                result=number1 / number2;
                break;
            case"%":
                result=number1 % number2;
                break;
            default:
                System.out.println(operator+" is Invalid operator");
                isValid = false;
        }

        if(isValid) {
            System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
        }else{
            System.out.println(operator+" is invalid operator");
        }





    }
}
