package day16_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your address");
        String address = input.nextLine(); // nextLine allow us to enter multiple words

        System.out.println("Address: "+address);
    }
}

