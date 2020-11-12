package day23_NestedLoop;

import java.util.Scanner;

public class FirstUpperLastLower {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        char f = str.charAt(0);//index
        char l = str.charAt(str.length()-1);//index

        boolean start = f >= 65 && f <= 90; //true.ascii table f>='A'&&f<='Z' 大写
        boolean end = l >= 97 && f <= 122; //true.小写

        if(start && end){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }


}
/*2.  Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase letter then print true, otherwise print false
        Ex:
           Input: Cybertek
           output: true
           Input: CyberteK
           output: false
 */