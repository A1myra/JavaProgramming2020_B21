package day16_Scanner;

import java.util.Scanner;

public class Browsers {
    /*Write a program that will ask the user to enter a browser type (firefox, chrome, safari, opera) Handle case sensitivity
    If a valid browser type is entered print ”Browser_type is opening...”
    If the given browser is not valid print “Browser_type is not a valid browser
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a browser type: ");
        String browser = input.nextLine();

        input.close(); //because we don't need scanner anymore

        switch (browser){
            case"CHROME": //just in case the input is capital letter.
            case"chrome":
                System.out.println("Chrome is opening");
                break;
            case"FIREFOX":
            case"firefox":
                System.out.println("Firefox is opening");
                break;
            case"SAFARI":
            case"safari":
                System.out.println("Safari is opening");
                break;
            case"OPERA":
            case"opera":
                System.out.println("Opera is opening");
                break;
            case"INTERNET EXPLORER":
            case"internet explorer":
                System.out.println("Internet Explorer is opening");
                break;
            default:
                System.out.println(browser+" is not valid browser");
                break;
        }


    }
}
