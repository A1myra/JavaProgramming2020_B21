package day23_NestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {
    //    String sentence = "Java is a programming language, I like to lean Java";
        String sentence = "i lobe vinira ,but vinira does not love yooo vinira";

      //  String word="Java";
        String word="vinira";
        int count=0;

        while(sentence.contains(word)){
    sentence = sentence.replaceFirst(word,"");
    count++;
        }

        System.out.println("count = " + count);
        System.out.println("sentence = " + sentence);
    }
}
