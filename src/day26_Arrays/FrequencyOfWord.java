package day26_Arrays;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "I love java, java is a cool programming language and java is more useful than javascript, python and python";

        String[] arr = sentence.split(" ");

        int countJava = 0;
        int countPython =0;


        for(int i=0; i<=arr.length-1; i++){

            if(arr[i].toLowerCase().contains("java")){
                countJava++;
            }

            if(arr[i].toLowerCase().contains("python")){
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);



    }
}


