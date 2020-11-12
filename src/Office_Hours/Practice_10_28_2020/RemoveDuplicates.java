package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abab";//"ab"

        String nonDup=""; //"ab"
            // if the character is not exist in nonDup, then we can concate it.

        for(int i=0; i<=str.length()-1; i++){
           char eachChar= str.charAt(i);  // each of the character in string

            if(nonDup.contains(""+ eachChar )){ //if the character is already contained in nonDup
                continue; //skip it
            }else{
                nonDup += eachChar  ;
            }
        }
        System.out.println(nonDup);





    }
}
