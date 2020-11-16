package day30_ReturnMethods;

public class ReturnMethod2 {

    public static void main(String[] args) {

        String names = "racecar";
        // String reversedName = reverseStr1("name); // can not return. can not assign this to any name

        String reversedName= reverseStr2(names);

        boolean isPalindrome = names.equalsIgnoreCase(reversedName);//true if its palindrome
        System.out.println(isPalindrome);

    }

    public static void reverseStr1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }

    //return method:
    public static String reverseStr2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }
}


