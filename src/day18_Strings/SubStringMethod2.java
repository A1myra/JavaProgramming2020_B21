package day18_Strings;

import java.util.Scanner;

public class SubStringMethod2 {

    public static void main(String[] args) {


        String str = "Today is Monday";
        //            0123456789

        String day1 = str.substring(9, str.length());

        System.out.println(day1);

        System.out.println("========================================");


        Scanner scan = new Scanner(System.in);

        System.out.println("First Name: ");
        String firstName =scan.next();
        firstName=firstName.substring(0,1).toUpperCase()  +  firstName.substring(1).toLowerCase();

        System.out.println("Last Name: ");
        String lastName = scan.next();
        lastName = lastName.substring(0,1).toUpperCase()  + lastName;







    }
}