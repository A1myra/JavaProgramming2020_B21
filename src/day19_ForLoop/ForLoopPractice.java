package day19_ForLoop;

public class ForLoopPractice {
    /* print numbers btw 0~100
     */
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==================================================");


        for (int i = 100; i <= 200; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("hello");

        System.out.println("==================================================");


        //Even
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("==================================================");
        //or
        // or we can use if statement
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
            System.out.println();
            System.out.println("==================================================");


            //Odd
            for(int i=0; i<=100; i+=2){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("==================================================");

            // or we can use if statement
            for(int i=0; i<=100; i++){
                if(i%2==0){
                    System.out.println(i+" ");
                }
            }

        System.out.println();
        System.out.println("==================================================");

        for(int i=1; i<= 500; i++){
            System.out.println("Push up: "+i);
        }


    }
}