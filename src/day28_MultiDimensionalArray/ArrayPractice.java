package day28_MultiDimensionalArray;

import java.util.Arrays;

public class ArrayPractice {
    /*
    ScrumTeam
    Testers:{"Dorin","Adil","Fatih","Subi"}
    Developers: {"Katrine","Mustafa","Ruslan"}
    SM:{"Ayse"}
    PO:{"Almira"}
    BA:{"Rinat"}
     */

    public static void main(String[] args) {
        String[][] scrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subi"}, // 0
                {"Katrine", "Mustafa", "Ruslan"},  // 1
                {"Ayse"},                        // 2
                {"Almira"},                      // 3
                {"Rinat"}};                      // 4

        System.out.println(Arrays.deepToString(scrumTeam));

        /*for (int i = 0; i <= scrumTeam.length - 1; i++) { //i: index of iD arrays
            System.out.println(Arrays.toString(scrumTeam[i]));

            for (int j = 0; j <= scrumTeam.length - 1; j++) { //j: index of elements
                System.out.println(scrumTeam[i][j]);
            }
        }

         */

        System.out.println("============================================");

        for( String[] eachGroup : scrumTeam ){ // eachGroup: represents each 1D array in scrumTeam

            System.out.println(Arrays.toString(eachGroup));

            for(String eachName:eachGroup){
                System.out.println(eachName);
            }
        }
    }
}
