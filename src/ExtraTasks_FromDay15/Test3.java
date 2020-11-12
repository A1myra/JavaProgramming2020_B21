package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
     /*- Ask the user to enter the year,
     month number,
     and day (pick any datatype for the values) they were born and print in the following format:
	" $month / $day / $year is your birthday "
      */
        Scanner result = new Scanner(System.in);
        System.out.println("Please enter the month of your birthday");
        int month = result.nextInt();

        System.out.println("Please enter the day of your birthday");
        int day = result.nextInt();

        System.out.println("Please enter the year of your birthday");
        int year = result.nextInt();

        System.out.println(month+"/"+day+"/"+year+" is your birthday");



    }
}
