package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {

        /*- Ask the user to enter two angle values (double).
         Find out what the third angle of the triangle is (Triangles have 180 degrees total).
         If the two angle values given exceed 180 already print "Invalid angles"
         */

        Scanner result = new Scanner(System.in);

        System.out.println("Please enter two angle values");
        System.out.println("angle 1 = ");
        double angle1 = result.nextDouble();
        System.out.println("angle 2 = ");
        double angle2 = result.nextDouble();

        double sum = angle1 + angle2;
        double angle3 = 0;

        if(sum>=180 || sum<=0){
            System.out.println("Invalid Triangle");
        }else{
            angle3=180-sum;
            System.out.println("angle 3 = "+angle3);
        }
    }
}
