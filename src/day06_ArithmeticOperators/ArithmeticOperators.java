package day06_ArithmeticOperators;

public class ArithmeticOperators {


    public static void main(String[] args) {

        System.out.println(10/4); //result is 2
        System.out.println("10/4"); //result is text

        System.out.println(12+3.0); //result is 15.0

        System.out.println("12"+3);//result is text+3

        System.out.println('a'+3);//every single char have number from the ascii table.
                         //97 +3

        System.out.println(12.0 - 4);//double result  8.0

        double a = 12.0 / 3;
        System.out.println(a);

        int b = 10/3;
        System.out.println(b);//return type is int, so we get 3.

        double c = 10/3; //int/int=int
        //     c = 3
        //     3.0
        System.out.println(c);

        double d = 10.0/3; //decimal/int=decimal
        System.out.println(d);

        int x = 3/2; //result is 1.5 in math
        //  x = 1
        System.out.println(x);

        double y = 3/2;
        //     y = 1
        //     1.0
        System.out.println(y);

        double z = 3.0/2.0;
        System.out.println(z);

        System.out.println("=====================================");

        System.out.println(100%13);
        System.out.println(100%10);

        System.out.println(20%4.5);





    }
}
