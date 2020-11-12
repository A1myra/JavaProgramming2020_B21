package day08_ShortHand_Relational;

public class Triangle {

    /*
        task:
        1. write a program that can cehck if the given triangle is valid
            angle1= 30
            angle2= 30
            angle3= 90

            sum  = 150
            output:
                the triangle is valid : false
         */
    public static void main(String[] args) {


        int angle1 = 30;
        int angle2 = 30;
        int angle3 = 90;

        int sum = angle1 + angle2 + angle3;
        boolean isValid = sum == 180;

        System.out.println("The triangle is valid: " + isValid);
    }
}