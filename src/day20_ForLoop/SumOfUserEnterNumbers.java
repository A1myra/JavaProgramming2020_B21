package day20_ForLoop;
import java.util.Scanner;
public class SumOfUserEnterNumbers {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        /*...*/
        int times = scan.nextInt(); // how many number user wants to enter
        int result =0;//to contain the sum of each user entered number
        //+1=1+2=3+3=6+4=10+5=15
        for(int i=1; i<=times; i++){
            System.out.println("Enter a number: "+i);
            result += scan.nextInt();// each user input will be added to result
        }
        // 1 2 3 4 5

        System.out.println("result = " + result);



    }
}
/*
    3. write a program that can calculate the sum of 5 user entered input
 */
