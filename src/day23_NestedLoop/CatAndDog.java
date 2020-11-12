package day23_NestedLoop;

public class CatAndDog {

    public static void main(String[] args) {
        String sentence = "dog dog Dog Dog cat CAT cAt cat"; //Given

        String temp=sentence.toLowerCase();//first we should ignore the case sensitivity.
        //after this we don't need to worry about case sensitivity.

        int countDog = 0;
        String word1 = "dog";
        while(temp.contains(word1)){
           temp = temp.replaceFirst(word1,"");
           countDog++;
        }
        System.out.println("Number of dogs: "+countDog);

        int countCat = 0;
        String word2 = "cat";
        while(temp.contains(word2)){
            temp = temp.replaceFirst(word2,"");
            countCat++;
        }
        System.out.println("Number of cats: "+countCat);

        System.out.println(countCat==countDog);
        //if num of cat and dog is equal, then true, otherwise false.





    }
}
