package day25_ArrayIntro;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "abcababe";
//                    01234567
        String result = ""; // "ce"


        for(int j=0; j<str.length(); j++) { //j represent index num of str

            char ch = str.charAt(j); // each char in str
            int count = 0; //for the frequency of ch
            for (int i = 0; i < str.length(); i++) { //i represents the index num of str.
                char eachChar = str.charAt(i); // each character of the string.
                if (eachChar == ch) {
                    count++;
                }
            }// main purpose for this loop is count the frequency of ch. then assign it to the count.

            if (count == 1) { //if the frequency is 1, it means it is unique
                //如果等于一，也就是只有一个的话，是特殊的。
                result += ch;
            }

        }

            System.out.println(result);






    }
}
