package day16_Scanner;

import java.util.Scanner;
/*Count up some points based on the users input:
    Ask the user how many people they live with?
        if user lives with Less than 2 people: add one point
        if the user lives with 3 - 6 people: add two points
        if the user lives with more than 6 people: add three points
    Ask the user what city they live in?
    Ask the user if the live in downtown ("yes or no")
        if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
            if they have thought about it, add one point
            if no, minus one point
    Ask the user their favorite animal?
    Ask the user how many pets they want?
    Ask SSN?
    Print everything and points
 */

public class AllOfYourPersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int point = 0;

        System.out.println("How many people do you live with?");
        int numOfPeople = input.nextInt();

        if(numOfPeople>0 && numOfPeople<12){

            if(numOfPeople<=2){ // only be 1 or 2
                point+=1;
            }else if (numOfPeople>2 && numOfPeople<7){ //include 3-6
                point+=2;
            }else{
                point+=3;
            }

            //serr <-- short cut
        }else{
            System.err.println("Not a valid number of people");
        }

        System.out.println("What city do you live in?");
        String city=input.next();

        System.out.println("Do you live in Downtown?");

    }
}