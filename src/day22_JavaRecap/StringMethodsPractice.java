package day22_JavaRecap;

import java.util.Scanner;

public class StringMethodsPractice {
    /*
    substring: creates substring from string
    substring(begIndex,endIndex):creates substring from beginning index till given ending index.(everything/entire)
    substring(beg):create substring from beginning index till end of string.(something/specific)
     */

    public static void main(String[] args) {
//substring(begIndex,endIndex)
        String sentence = "My name is Almira";
        //                 0123456789'''''''
        String name1 =sentence.substring(11, sentence.length() );
        System.out.println(name1);
//substring(beg)
        String name2=sentence.substring(11);
        System.out.println(name2);
        //new example
        String str1 = "Monday is cool, it's a fun day";
        //             012345
        //should use substring(begIndex,endIndex), cant only use beg.
        String day1 = str1.substring(0,5+1);
        System.out.println(day1);
//indexOf
        String day2 = str1.substring(0,str1.indexOf(" is"));
        System.out.println(day2);

//lastIndexOf
        String s1="https://www.amazon.com"; //.com, .edu, .net,.gov
        String domain = s1.substring(s1.lastIndexOf(".")+1);//if I don't add 1, it will print .com, if I add it, it will print com
        System.out.println(domain);

        String name= s1.substring(s1.indexOf(".")+1,s1.lastIndexOf("."));
        System.out.println(name);

//upperCase
        name = name.substring(0,1).toUpperCase() + name.substring(1,name.length());
        // Amazon, first letter uppercase;
        System.out.println(name);

        System.out.println("=============================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name");
        //                              A  lMi ra ==> Almira
        String firstName = scan.nextLine().toLowerCase().replace(" ","");//first convert all to lower case,then remove all the spaces by replacing space with empty space.
        //can not use trim, because trim is for front and end spaces.
        System.out.println("Please enter your last name");
        //                               r In a T==> Rinat
        String lastName = scan.nextLine().toLowerCase().replace(" ","");
scan.close();

        firstName=firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        String fullName = firstName+" "+lastName;
        System.out.println("fullName = " + fullName);












    }
}
