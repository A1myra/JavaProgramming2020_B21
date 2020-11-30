package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterList {

    public static void main(String[] args) {

        String str= "abcd@!#$etyi123lkj*^%897";

        ArrayList<String> digits = new ArrayList<>(Arrays.asList(str.split("")));
        digits.removeIf(p->!Character.isDigit(p.charAt(0)));//removes the characters that are not digit
        System.out.println(digits);

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        letters.removeIf(p->!Character.isLetter(p.charAt(0)));//removes the characters that are not letter
        System.out.println(letters);

        ArrayList<String> specialCharacters = new ArrayList<>(Arrays.asList(str.split("")));
        specialCharacters.removeAll(digits);
        specialCharacters.removeAll(letters);
        //removes the character that are digit or letters

        System.out.println(specialCharacters);
    }
}
