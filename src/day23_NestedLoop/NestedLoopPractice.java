package day23_NestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {
//triangle
        for (int j = 1; j <= 8; j++) { // j: 1,2,3,4,5,6,7,8
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println(); //7 * printed in every new line.
        }


        for (int j = 1; j <= 8; j++) { // j: 1,2,3,4,5,6,7,8
            System.out.print("\t\t\t\t");
            for (int i = j; i <= 8; i++) {
                System.out.print("*");
            }
            System.out.println(); //7 * printed in every new line.
        }
    }
}