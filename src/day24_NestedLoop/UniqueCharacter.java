package day24_NestedLoop;

public class UniqueCharacter {

    /*3. write a program that can find the unique characters from a string
            Ex:
                 str = "AABCCD";
                 output:
                        BD
            approach:
                    find the frequncy of each character one by one,
                     and if the frequency of the character is equal to 1,
                     it means it's unique
             In previous section we learned how to find the frequency of one character.
              you will need to repeat the same steps
     */

    public static void main(String[] args) {

        String str = "AABCCD";

        for(int index=0; index< str.length(); index++){ // index <= str.length()-1;
            // purpose of this loop is to iterate through teh char one at a time.

            int frequency = 0;

            // charAt(index)
            // 0--> A

            for(int inner=0; inner <=str.length()-1; inner++){

                //charAt (inner) --> A A B C C D

                if(str.charAt(index) == str.charAt(inner)){
                   frequency++;
                }


            }

        }




    }
}
