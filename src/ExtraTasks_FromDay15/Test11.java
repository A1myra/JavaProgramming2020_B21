package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test11 {

    public static void main(String[] args) {

        /*- Ask the user to enter the curve percentage for the class
        and to enter their grade to determine if the curve will allow them to get an A (>= 90).
        [Use double datatype]
	- In the case the given curve is more than 100 or less than 0, print Invalid curve
	- In the case the given grade is less than 0, print invalid grade
	- In the case the student was not able to get an A after the curves (grade was less than 90).
	 Ask them if they did the extra credit assignments(boolean) If the student did the extra credit add 2 whole percentage to their grade

	Ex: 15, 80 --> 92.0 after curve. Final Grade:  92.0
	Ex: 25, 55 --> 68.75 after curve, Did you do extra credit -> false -> Final grade: 68.75
	Ex: 20, 60 --> 72.0 after curve, Did you do extra credit -> true -> Final grade: 74.0

	Hint: (curve value / 100) --> Percentage value of the curve
    */

        Scanner result = new Scanner(System.in);

        System.out.println("Please enter a curve percentage for the class");
        double percentageForClass = result.nextDouble();
        System.out.println("Please enter your grade to determine if the curve will allow you to get an A");
        double grade = result.nextDouble();

        double gradeAfterCurve = percentageForClass * grade / 100 + grade;
        double gradeAfterCredit = 0;

        if(percentageForClass>100 || percentageForClass<0){
            System.out.println("Invalid curve");
        }
        if(grade<0){
            System.out.println("Invalid grade");
        }

        if (gradeAfterCurve >=90) {
            System.out.println(percentageForClass + " , " + grade + "-->"
                    + gradeAfterCurve + " after curve. Final Grade: " + gradeAfterCurve);
        }else{
            System.out.println("did you do the extra credit assignments? " +
                    "please enter true or false, true if you did, false if you did not ");
        }

        boolean extraCredit = result.nextBoolean();

        if (extraCredit) {
            gradeAfterCredit = gradeAfterCurve+2;
            System.out.println(percentageForClass+", "+grade+"-->"+gradeAfterCurve
            +" after curve, "+"Did you do extra credit -->"+extraCredit+"-->"+"Final Grade: "
            +gradeAfterCredit);
        }else{
            System.out.println(percentageForClass+", "+grade+"-->"+gradeAfterCurve
            +" after curve, "+"Did you do extra credit -->"+extraCredit+"-->"+"Final Grade: "
            +gradeAfterCurve);
        }


    }
}
