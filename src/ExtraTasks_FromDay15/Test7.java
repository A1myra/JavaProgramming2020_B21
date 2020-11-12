package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {

        /*- The marks obtained by a student in 3 different subjects are input by the user.
         Your program should calculate the average of subjects.
          The student gets a grade as per the following rules:
	90-100	A
	80-89	B
	70-79	C
	60-69	D
	0-59	F

	Ex: 86, 74, 90 -> B

         */

        Scanner result = new Scanner(System.in);
        System.out.println("Please enter your three different subjects score");
        double sub1= result.nextDouble();
        double sub2= result.nextDouble();
        double sub3= result.nextDouble();

        double sum = sub1 + sub2 + sub3;
        double average = sum /= 3;
        String grade = " ";

        if(average>100 || average<0){
            grade = "Invalid grade";
        }else if(average>=90){
            grade="A";
        }else if(average>=80){
            grade="B";
        }else if(average>=70){
            grade="C";
        }else if(average>=60){
            grade="D";
        }else{
            grade="F";
        }

        System.out.println("Grade: "+grade);


        }



    }
