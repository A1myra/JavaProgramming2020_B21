package day26_Arrays;

public class FrequencyOfEachChars2 {

    public static void main(String[] args) {
        String str = "aaabbc";
        str=str.replaceFirst(" ","");
        String expectedResult = "";

        for( int j = 0; j <= str.length()-1; j++){

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i <= str.length() - 1; i++) {
                char eachChar = str.charAt(i);
                if (eachChar == ch) {
                    count++;
                }
            }

            if (expectedResult.contains("" + ch)) {

            } else {
                expectedResult += "";
            }
        }
    }

}
