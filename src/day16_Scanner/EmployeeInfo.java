package day16_Scanner;

import java.util.Scanner;

public class EmployeeInfo {
    /*Ask the user to enter their first name.
    Then ask the user to enter their last name.
    Then ask the user if they are currently employed.
If the user is employed, also ask them what their salary is.
Print all the information at the end: ”Full name is:” full name “Employed:” status
“Salary:” salary
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = input.next();

        System.out.println("Please enter your last name");
        String lastName = input.next();

        System.out.println("Are you currently employed? " +
                "please enter true for yes, false for not");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;

        if(isEmployed){
            System.out.println("What is your salary?");
            salary = input.nextDouble();
        }

        input.close();
        System.out.println("Full name: "+firstName+" "+lastName);
        System.out.println("Employeed: "+isEmployed);
        System.out.println("Salary: "+salary);
        }


    }
