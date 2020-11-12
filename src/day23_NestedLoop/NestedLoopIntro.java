package day23_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

   /* for (int i= 1; i<=10; i++){
        System.out.print(i+" ");
    }
        System.out.println();

        for (int i= 1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i= 1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i= 1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i= 1; i<=10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

    */

        for(int j=1; j<=5; j++){ //repeat one line for 5 times

            for (int i= 1; i<=10; i++){ //print from 1 to 10
                System.out.print(i+" ");
            }
            System.out.println();
        }


        System.out.println("======================================");

        for(int j=1; j<=10; j++){

            for(int i=1; i<=7; i++){
                System.out.print("*");
            }
            System.out.println(); //7 * printed in every new line.
        }

        System.out.println("======================================");





    }

}
