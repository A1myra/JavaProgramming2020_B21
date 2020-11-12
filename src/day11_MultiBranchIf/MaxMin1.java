package day11_MultiBranchIf;

import org.w3c.dom.ls.LSOutput;

public class MaxMin1 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2= 50;
        String maxNum = "";

        if(num1>num2){
            maxNum = num1 + ": is  the maximum number";
        }else{
            maxNum = num2 +" : is the maximum number";
        }
        System.out.println(maxNum);

        System.out.println("==============================");

        String maximumnumber = (num1>num2)? num1 + ": is the maximum number" : num2 + " : is the maximum number";

        System.out.println(maximumnumber);

        System.out.println("===============================");


        String minNum = "";
        if (num1 < num2) {
            minNum = num1 + " : is the minimum number";
        } else {
            minNum = num2 + " : is the minimum number";
        }
        System.out.println(minNum);


        System.out.println("================================");

        String minimumNum = (num1 < num2) ? num1 +" : is the minimum number" : num2 + " : is the minimum number";

        System.out.println(minimumNum);
    }
    }



/*Task:
    1. write a program that can find the maximum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement
    2. write a program that can find the minimum number between two different numbers
            first solution: if & else statement
            second solution: do not use any if statement
 */