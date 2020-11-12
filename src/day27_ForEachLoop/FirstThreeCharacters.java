package day27_ForEachLoop;

public class FirstThreeCharacters {

    public static void main(String[] args) {

        /*
        1.create string array, and store the names of your class mates(10)
        print the first three characters of each name

         */

        String[] name = {"Rinat","Almira","madina","nunux","nayima","lala","aynigar","erpan","umut","parat"};

        for ( String eachName : name){
            System.out.println(eachName.substring(0,3));
        }
    }
}
