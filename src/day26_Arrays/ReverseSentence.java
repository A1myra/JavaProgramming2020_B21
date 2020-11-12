package day26_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your sentence:");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        //Today is Monday

        String reversedSentence="";
        for(int i=words.length-1; i>=0; i--){
            reversedSentence+=words[i] +" ";
        //Monday is Today
        }

        reversedSentence=reversedSentence.trim(); // just to make sure there is no space after the sentence
        System.out.println(reversedSentence);


    }
}