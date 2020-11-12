package day14_switch_Recap;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int a = 10;

        if(a%2 == 0){
            System.out.println("Even number");
            System.out.println(a+"is even number");
        }else{
            System.out.println("Odd number");
            System.out.println(a+"is odd number");
        }
        System.out.println("=====================================");

        System.out.println("=====================================");

        int b = 10;

        if (b > 0)
            System.out.println("positive");
        else if(b<0)
            System.out.println("negative");
        else
            System.out.println("zero");

        System.out.println("=====================================");

        int number = 5;
        String day = " ";

        if(number>=1 && number<=7)
            if(number==1)
                day="Monday";
            else if(number==2)
                day="Tuesday";
            else if (number==3)
                day="Wednesday";
            else if (number==4)
                day="Thursday";
            else if (number==5)
                day="Friday";
            else if (number==6)
                day="Saturday";
            else if (number==7)
                day="Sunday";


        else
            day="Invalid";
        //if it has one statement ONLY, it can be without { }.
        System.out.println(day);

    }
}
