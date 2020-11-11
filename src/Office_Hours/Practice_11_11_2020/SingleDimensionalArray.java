package Office_Hours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        int [] scores = new int[5]; // first we must initialize the size
                            //length

        scores[1] =10;
        scores[2] =20;
        scores[0] =50;
        scores[3] =30;
        scores[4] =40;
        //  index

        System.out.println(Arrays.toString(scores)); //[50, 10, 20, 30, 40]
                                                //       0   1   2   3   4
        System.out.println("===================================================");

            //print 50
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        System.out.println("===================================================");

        for(int i=0; i<=scores.length-1; i++){ // 0 1 2 3 4
            //        i<5
            System.out.println(scores[i]);
        }

        System.out.println("===================================================");

        for(int each:scores){ //each:element
            System.out.println(each);

        }
    }
}
