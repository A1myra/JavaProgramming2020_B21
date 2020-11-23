package day32_LocalDate_WrapperClass;

public class CharacterWrapperClass {

    public static void main(String[] args) {
            char n='8';

        System.out.println( Character.isDigit(n)); //true if its number
        System.out.println(Character.isLetter(n)); //true if its letter

        String str = "a1b2c3b4c5d6@w$ %^$@#";

        String digits ="";
        String letters="";
        String specialChar=""; //even space is specialCharacters

        for(char each : str.toCharArray()){
            if(Character.isDigit(each)){
                digits += each;
            }else if(Character.isLetter(each)){
                letters += each;
            }else{
                specialChar += each;
            }
        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChar);

/*
password validation:

 */

    }
}
