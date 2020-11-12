package day16_Scanner;

import java.util.Scanner;

public class Scanner_Close {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        input.close();//After closing we can not use the scanner again
        //We will need to recreate it.

        System.out.println(input.next());//This gives exception when running, because scanner was closed.
    }
}
