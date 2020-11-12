package day06_ArithmeticOperators;

public class AboutMyself {

    public static void main(String[] args) {


    /*

Task01: AboutMyself
    variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow
    output:
        Full name is: YourFullName
        From: YourCountryName
        Favorite boos is: "YourFavovoriteBook"
        Favorite Show is: "YourFavoriteShow"

     */

        //String firstName="Halimiyan", lastName="Hamulate", fullName = firstName+" "+lastName;
        //we can do it like up,
        // but we will do it later,so declare the variables one by one is better.

        String firstName = "Halimiyan";
        String lastName = "Hamulate";
        String fullName = firstName+" "+lastName;
        String from = "USA";
        String favoriteBook = "milk and honey";
        String favoriteShow = "cukur";

        System.out.println("Full name is: "+fullName);
        System.out.println("From: "+from);
        System.out.println("Favorite book is: \""+favoriteBook+"\"");//"\"" is double code.
        System.out.println("Favorite show is: \""+favoriteShow+"\"");



    }

}
