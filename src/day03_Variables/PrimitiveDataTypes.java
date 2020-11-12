package day03_Variables;

public class PrimitiveDataTypes {

    /*
    declare variables
            DataType name = Data;
     */
    public static void main(String[] args) {
        // score is 85
        byte score = 85;

        System.out.println(score);
        System.out.println("score");

        //long number0 = 9999999999;
        // int is prefered, compiler takes it as an int, and the number 9999999999 is out of int range.

        long number1 = 9999999999l; //add l, so compiler take the number as long, not int.
        //does not matter l is upper or lower case.

        double decimal = 0.5;
        //float float1 = 0.5; // double is prefered for decimals, compiler takes it as double, double range is greater than float.
        float float2 = 0.5f; //add f, so compiler takes it as float,

        System.out.println(float2); //0.5


        /*
        in future:
                for integers: int
                for decimal: double
         */




    }
}
