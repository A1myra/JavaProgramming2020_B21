package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        /*- Ask the user to enter their zip-code (long),
        the number of people they live with (byte),
         if they are married or not (boolean - true for married/false for not)
          and print the values in the following format:
         */

        Scanner result = new Scanner(System.in);

        System.out.println("Please enter your zipCode");
        long zipCode= result.nextLong();

        System.out.println("Please enter the number of people that you live with");
        byte NumberOfPeople = result.nextByte();

        System.out.println("Please enter true or false if you are married, true for married, false for not");
        boolean married= result.nextBoolean();



        if(married){
            System.out.println("I see you are married!");
        }else{
            System.out.println("I see you are not married!");
        }

        System.out.println(married+" and live with "
                +NumberOfPeople+"people in your house which is in the "
                +zipCode+" are!");




    }


}
