package day26_Arrays;

public class FrequencyOfEachChars {

    public static void main(String[] args) {
        String str = "aaabbc"; //"a3b2c1"
//Step 1 : remove duplicates
        String nonDup ="";  //"abc"
        for(int i = 0; i< str.length(); i++){ // i : 0~1~2~3~4~5 last index
            String eachChar = ""+str.charAt(i); // a,a,a,b,b,c
            if(!nonDup.contains(eachChar)){
                nonDup += eachChar;
            }
        }

        System.out.println(nonDup);

        String result = ""; //"a3b2c1"

//Step2 : find the frequency of each of the non duplicated characters from the original string.
        for(int j=0; j<= nonDup.length()-1; j++) {

            char ch = nonDup.charAt(j); // a
            int count = 0; // to contain frequency of char ch variable.
            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i); //a,a,a,b,b,c
                if (ch == eachChar)
                    count++;


            }
            result += ch + "" + count;
            //        'a' + 3

            System.out.println(result);


        }
    }
}

/*
 1. write a program that can return the frequency of characters from a String
            Ex:
                str = "ababaac";
                output:
                    a3b2c1
 */