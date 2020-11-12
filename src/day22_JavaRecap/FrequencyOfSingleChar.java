package day22_JavaRecap;

public class FrequencyOfSingleChar {
    /*
    1.str = "abababababa";
    ch = 'a';

    output: 6
     */
    public static void main(String[] args) {
        String str = "I like to learn java, I would love to join Cybertek";
        char ch='e';

        int count=0;

        for(int i = 0; i <= str.length()-1; i++){
            char eachChar = str.charAt(i); // represents each character from the string.

            if(ch == eachChar){
                count++;
            }
        }

        System.out.println("count = " + count);




    }

}
