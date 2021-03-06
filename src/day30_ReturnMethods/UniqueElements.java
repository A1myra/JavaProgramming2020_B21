package day30_ReturnMethods;

public class UniqueElements {

    public static void main(String[] args) {

        String str = "aaabbbcccdddefffffg";


        String unique = ""; //eg
        for(int i=0; i<=str.length()-1; i++){
            char each = str.charAt(i); //each character from the string
            int count = Frequency(str,each ); //finding the frequency of every single char from string

            if(count == 1){  //if frequency is equal to 1, then the character is unique.
                unique+=each;
            }
        }

        System.out.println("unique = " + unique);

        System.out.println("============================================");
        String word = "ababcdedeh";

        String reusult = unique(word);
        System.out.println(reusult);

    }
                                    // "aaabc"       'a' ===> 3
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




}
