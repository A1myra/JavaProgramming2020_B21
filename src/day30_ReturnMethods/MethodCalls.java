package day30_ReturnMethods;

import library.StringUtility;
import library.ArraysUtility;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {
        String str= "Level";

        String reverseName = StringUtility.reverse(str);
        System.out.println(reverseName);
        System.out.println(str.equalsIgnoreCase(reverseName));


        String str2 = "aaabbbbcccccdddddeeeeee";
        String result2 = StringUtility.removeDuplicates(str2);
        System.out.println(result2);


        String str3 = "aabcccdeee";
        String result3 = StringUtility.unique(str3);
        System.out.println(result3);

        System.out.println("=========================================");

        int[] array = {1,0,-2,30,40,500,-20,-50};
        int[] descending = ArraysUtility.sort(array);
        System.out.println(Arrays.toString(descending));
        System.out.println(ArraysUtility.printArray(descending));

        System.out.println("=========================================");

        String s1 = "cccccccccccbbbbbbbbbaaaaaaaaa";
        String s2 = "bbbbbbbbbbbbbbbaaaaaaaaaaaccccccc";
        boolean anagram= StringUtility.isAnagram(s1,s2);
        System.out.println(anagram);

    }
}
