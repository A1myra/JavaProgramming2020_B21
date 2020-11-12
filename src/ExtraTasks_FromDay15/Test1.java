package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test1 {

        public static void main(String[] args) {

/*- Ask the user to enter their height (double),
 shoe size (byte),
  and if they like to wear hats (boolean).
  Print out the information
 */

            Scanner result = new Scanner(System.in);
            System.out.println("Please enter your height: ");
            double height = result.nextDouble();

            System.out.println("Please enter your shoe size: ");
            byte shoeSize = result.nextByte();

            System.out.println("Do you like to wear hat? Please enter true or false");
            boolean wearHat = result.nextBoolean();

            System.out.println("Height: "+height);
            System.out.println("Shoe size: "+shoeSize);

            if(wearHat){
                System.out.println("That is cool, you like  to wear hat");
            }else{
                System.out.println("That is fine, if you don't like to wear hat");
            }
        }

    }


