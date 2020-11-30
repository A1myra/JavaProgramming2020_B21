package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAABBCDDDDEEE";
        //A3B2C1D4E3
        String result = "";

        ArrayList<String> list = new ArrayList<>(); //created this in order to be able to use frequency method
        for (String each : str.split("")) list.add(each); //added each character from str added into arraylist

        for (String each : list) {
            int frequency = Collections.frequency(list, each);

            if (!result.contains(each)) { //to avoid duplicated characters in the result
                result += each + frequency;
            }
        }
            System.out.println(result);

    }
}
