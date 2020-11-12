package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {

        /*- Recreate the task which tells the user how many days are in a given month (day 13).
        Accept a month (number) and year from the console and print how many days are in that specific month.
         Handle leap years.
          Try to redo this ask without looking at the previous code.
         */

        Scanner result = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int year = result.nextInt();
        System.out.println("Please enter a month: ");
        int month = result.nextInt();

        String numberOfDays = " ";

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays="31 Days";
                break;

            case 2:
                numberOfDays=(year%4==0)?"29 days":"28 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays="30 days";
                break;

            default:
                System.out.println("No such a month");

        }

        System.out.println("number of days: "+numberOfDays);



    }
}
