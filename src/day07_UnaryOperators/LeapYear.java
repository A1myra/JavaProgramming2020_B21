package day07_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2020;
        boolean isLeapYear = 2020 % 4 < 1; //checks if 2020 is evenly divisible by 4.
        //   0   < 1; ===> true
        System.out.println(year + " is Leap Year: "+isLeapYear );


        /*
        Warm Up tasks:
    1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
                year = 2020
            output:
                2020 is leap year: true
                year = 2021
            output:
                2021 is leap year: false
        Hint: if the number of year can be evenly divisible by 4, it's known as leap year

         */


    }
}
