package day27_ForEachLoop;

import java.util.Arrays;

public class CombineThreeArrays {

    public static void main(String[] args) {

        String[] group1 = {"almira","mimi","gulnur","hulaj","nigar"};
        String[] group2 ={"rinat","akram","emin","xaydin","barat","daniyar","mukadas","bimbo","simba","ashburn"};
        String[] group3={"Abdul", "Sacha", "Amin", "Salih", "Jessica"};
        String[] group4={"Justyna", "Adil","Ercan","Irina","Med", "Olesea","Vlad","Asuman","Guvenche"};

        String[] group = new String[group1.length + group2.length + group3.length + group4.length];
        int i = 0;

        for(String each:group1){
            group[i++]=each;
        }

        for(String each:group2){
            group[i++]=each;
        }

        for(String each:group3){
            group[i++]=each;
        }

        for(String each: group4){
            group[i++]=each;
        }

        System.out.println(Arrays.toString(group));

    }
}
