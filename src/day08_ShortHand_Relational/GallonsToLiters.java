package day08_ShortHand_Relational;

public class GallonsToLiters {

    public static void main(String[] args) {

        int  gallons = 100;
        /*double Liters = gallons * 3.785;
        int result = (int) Liters;
        System.out.println(100+" gallons equal to "+result+" liters");
         */
int liters = (int)(gallons * 3.785);
        System.out.println(gallons + " gallons equal to " +liters +" liters");
        // we can still casting large to small by add int to here.


    }
}
/*
        1. write a program that converts the given number of gallons to liters.
        Note: MUST return integer result
        Ex:
        gallons: 100
        output:
        100 gallons equal to 378 liters
        Hint: 1 gallon = 3.785 liters

 */
