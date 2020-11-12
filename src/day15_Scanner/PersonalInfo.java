package day15_Scanner;

import java.util.Scanner;

public class PersonalInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        byte age = input.nextByte();

        System.out.println("Please enter your favorite number");
        long favNum = input.nextLong();

        System.out.println("Are you a student? Please enter true or false");
        boolean isStudent = input.nextBoolean();

        System.out.println("Age : "+age);
        System.out.println("Favorite number : "+favNum);

        if(isStudent){
            System.out.println("Great, you are a student");
        }else{
            System.out.println("Oh okay, you are not a student");
        }
    }
}
/*- Ask the user to enter their age (byte),
ask them to enter their favorite number (long),
 and ask them if they are a student (boolean).
  Print all the values from the inputs
*/