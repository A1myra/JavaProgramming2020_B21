package library;

public class StringUtility {


    public static int Frequency(String str, char ch){
        int count=0;

        for(char each : str.toCharArray() ){ //[a, a, a, b, c]
            if(each == ch){
                count++;
            }
        }
        return count;
    }


    public static String unique(String str){
        String unique = ""; //eg
        for(int i=0; i<=str.length()-1; i++) {
            char each = str.charAt(i); //each character from the string
            int count = Frequency(str, each); //finding the frequency of every single char from string

            if (count == 1) {  //if frequency is equal to 1, then the character is unique.
                unique += each;
            }
        }
        return unique;


    }


    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }


    public static String removeDuplicates(String str) {
        String result = ""; //abc
        for (String each : str.split("")) {//each: [a, a, b, c, c, b]
            if (result.contains(each)) {
                continue;
            } else {
                result += each;
            }
        }
return result;
    }


    public static String frequencyOfCharacters(String str){
        String result = ""; //a3b4c2

        String nonDup =  StringUtility.removeDuplicates(str);   // a b c

        for(int i =0; i <= nonDup.length()-1; i++) {
            char ch = nonDup.charAt(i);  //a
            int count = StringUtility.Frequency(str, ch);   // 3 4 2
            result += "" + ch + count;
        }

        return result;
    }


}
