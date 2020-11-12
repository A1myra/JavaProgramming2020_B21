package day21_WhileLoop;

import java.util.Scanner;

public class BUGStringPractice1 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.nextLine(); //"Java"\

        int lastIndex = word.length()-1;
        char f= word.charAt(0);
        int l= word.charAt(lastIndex);

        System.out.println("" +f  +  l );
        //                 106+ 97 = 203

        String r1 = "Batch "+2+1;
        System.out.println(r1);

        System.out.println("=============================================");

        while (true){
            System.out.println("Enter your building number:");
        String buildingNumber = scan.next();

        scan.nextLine();
        System.out.println("Enter your street: ");
        String street = scan.nextLine();

        System.out.println("Enter your apartment number: ");
        String apartmentNumber= scan.next();

        scan.nextLine();
        System.out.println("Enter your city name: ");
        String cityName= scan.nextLine();

        System.out.println("Enter your state name: ");
        String state= scan.nextLine();

        System.out.println("Enter your zip code:");
        int zipCode = scan.nextInt();

        String fullAddress = buildingNumber+" "+street+", Apt# "+apartmentNumber+"\n"+cityName+", "+state+" "+zipCode;

        System.out.println(fullAddress);

        System.out.println("Would you like to continue? yes, No ");
        String answer = scan.next();

        if(answer.equalsIgnoreCase("no")){
            break;
        }
        }

        //String buildingNumber(next())
        //String street(nextLine())
        //String apartmentNumber(next())
        //String cityName(nextLine())
        //String State(nextLine())
        //int zipCode(nextInt())








    }
}
