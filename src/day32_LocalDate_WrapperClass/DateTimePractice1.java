package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTimePractice1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first person's birth year, month, day"); //Almira
        LocalDate DofB1 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        System.out.println("Enter second person's birth year, month, day"); //Rinat
        LocalDate DofB2 = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        if (DofB1.isBefore(DofB2)) {
            System.out.println("Almira is older");
        } else if (DofB1.isAfter(DofB2)) {
            System.out.println("Rinat is older");
        } else {
            System.out.println("Almira and Rinat is same age");
        }

        //current
        int age1 = LocalDate.now().getYear() - DofB1.getYear();
        System.out.println("Almira is: " + age1);
        int age2 = LocalDate.now().getYear() - DofB2.getYear();
        System.out.println("Rinat is: " + age2);

        //after 30 year:
        int after1 = age1 + 30;
        int after2 = age2 + 30;

        System.out.println("After thirty years, Almira will be: " + after1);
        System.out.println("After thirty years, Rinat will be: " + after2);

        LocalDate DofB3 = LocalDate.of(1980,12,5);
        System.out.println(calculateAge(DofB3,20));
        //the person who was born in 1980, will be 60 after 20 years
    }
        /*
        parameters:
        DofB
        year
         */

        public static int calculateAge(LocalDate DofB, int year){
            return LocalDate.now().plusYears(year).getYear() - DofB.getYear();
            //after how many year how old you will be.
        }



}
