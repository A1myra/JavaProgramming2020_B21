package day25_ArrayIntro;

import java.util.Scanner;
public class WeekName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("Enter a day: ");
        int day = scan.nextInt();

        System.out.println("Today is: "+week[day-1]);

    }
}