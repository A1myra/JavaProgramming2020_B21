package day16_Scanner;

import java.util.Scanner;

public class Scanner_NextLine2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age =  input.nextInt();

        System.out.println("Enter your phoneNumber");
        long phoneNum = input.nextLong();

        input.nextLine();//the purpose of this is to accept the enter key.
        System.out.println("Enter your name: ");
        String fullName = input.nextLine();// be careful we want fullName! next line!

        System.out.println("Name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("PhoneNumber: "+phoneNum);

    }
}
