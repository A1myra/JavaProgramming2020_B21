package day10_IfElseStatement;

public class ValidTriangle {

    public static void main(String[] args) {


        double angle1 = 60;
        double angle2 = 30;
        double angle3 = 90;


        boolean isValid = (angle1+angle2+angle3) == 180;
                        // if sum of three angles equal to 180, then it's valid triangle ==> true
                        // otherwise  ==> false

        if(isValid){
            System.out.println("It is a valid triangle");
        }

        if(!isValid);{
            System.out.println("It is not a valid triangle");
        }

        // if its valid triangle, then check if it is the right triangle





    }
}
/*
Task01: ValidTriangle
         A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triangle is valid or not.

 */