package day22_JavaRecap;

import java.util.Scanner;
public class StringMethodPractice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Print out the initials.
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        System.out.println("Enter your last name: ");
        String l = scan.nextLine();

        String initial = f.substring(0,1).toUpperCase() +"."+ l.substring(0,1).toUpperCase();

        System.out.println("initial = " + initial);


    }
}
