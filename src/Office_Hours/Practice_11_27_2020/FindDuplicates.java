package Office_Hours.Practice_11_27_2020;

import java.util.ArrayList;

public class FindDuplicates {

    public static void main(String[] args) {
        char[] chars = {'A', 'A', 'B', 'C', 'C', 'D', 'A'}; //[A,A,C,C,A]

        ArrayList<Character> duplicatedElementslist = new ArrayList<>();

        for (int i = 0; i <= chars.length - 1; i++) {

            int count = 0;
            for (char each : chars) { //responsible for finding frequency of one element at a time
                if (each == chars[0]) {
                    count++;
                }
            }
            if (count != 1) { // responsible to verify if the element is duplicated
                duplicatedElementslist.add(chars[i]);
            }


        }
    }
}
