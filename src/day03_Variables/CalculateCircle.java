package day03_Variables;

public class CalculateCircle {

    public static void main(String[] args) {

        //A = radius * radius * PI
        //P = 2 * radius * PI

        double radius = 3.5;
        double PI = 3.14;

        double area = radius * radius * PI;
        double perimeter = 2 * radius * PI;

        System.out.print("area: ");
        System.out.println(area);
        System.out.print("perimeter: ");
        System.out.println(perimeter);




    }
}
