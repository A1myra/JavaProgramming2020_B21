package day09_IfStatement;

public class EligibleToBuyAlcohol2 {

    public static void main(String[] args) {

        int age = 25;

        boolean eligible = age >= 21;
            // false

        if(eligible){
            System.out.println("you are eligible to but alcohol");
        }
        if(!eligible){
            System.out.println("go buy your milk");
        }
        //only one of them can be executed.

        System.out.println("=============================");

        boolean isBreakTime = false;

        if(isBreakTime){
            System.out.println("time to take a break");
        }

        if(!isBreakTime){ //!false
            System.out.println("let's continue the class");
        }

        System.out.println("=============================");






        }
    }

