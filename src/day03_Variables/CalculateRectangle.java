package day03_Variables;

public class CalculateRectangle {


    //write a program that can calculate the area & perimeter of any rectangle that has integer number

    public static void main(String[] args) {

        // width:10, length:20

        int width = 10;
        int length = 20;

        int area = width * length;
        //           5   *   20
        int perimeter = width * 2 + length * 2;

        System.out.print("Area is: ");
        System.out.print(area);

        System.out.print("Perimeter is: ");
        System.out.print( perimeter );




    }
}
/*
declare variables:
        DataType name = Data;
 */