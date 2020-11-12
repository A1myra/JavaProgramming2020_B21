package day18_Strings;

import java.util.Scanner;

public class SubstringMethod {

    public static void main(String[] args) {


        String str = "Today is Monday";
        //            0123456789    14


        String day = str.substring(9,14+1);
        System.out.println(day);

        String email="amiraa1225@gmail.com";
                    //0123456789
        String domain=email.substring(11,15+1);
        System.out.println("Domain of the email "+email+" is: "+domain);


        String s1 ="I like movies and books";
                 // 0123456789            22
        String word1 = s1.substring(7,12+1);
        System.out.println("word1 = " + word1);

        String word2 = s1.substring(18,22+1);
        System.out.println("word2 = " + word2);

        System.out.println("====================================================");

        String firstName = "aLmIrA"; //Almira
        String firstChar = firstName.substring(0,1).toUpperCase();
        String rest = firstName.substring(1,firstName.length()-1+1).toLowerCase();

        System.out.println("firstChar = " + firstChar);
        System.out.println(rest);

        firstName = firstChar+rest;

        System.out.println(firstName);

        System.out.println("====================================================");

        /*
        ask the user to enter first adn last names, then print out the full name
        input:
        cYbErTeK
        sCHOOL

        output:
        Cybertek School
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String f = scan.nextLine();

        f = f.substring(0,1).toUpperCase()  + f.substring(1,f.length()-1+1).toLowerCase() ;
        //意思就是一个词前面第一个是大写，后面都是小写；
        System.out.println("Enter your last name: ");
        String l = scan.nextLine();
        l = l.substring(0,1).toUpperCase()  + l.substring(1,l.length()).toLowerCase();
        System.out.println("first name is : "+f);
        System.out.println("last name is : "+l);

        String fullName = f + " "+l;
        System.out.println("full name is : "+fullName);








    }
}
