package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("How many friends?");//ask
        int number = scan.nextInt();//enter

        String[] firstName = new String[number];//size of array
        String[] lastName = new String[number];

        //this loop is for storing the names
        for(int i=0; i<number; i++) {//i: 0,1,2,3...lastIndex

            System.out.println("Enter first name: ");
            String f = scan.next();
            f = f.substring(0, 1).toUpperCase() + f.substring(1).toLowerCase();
            firstName[i] = f;

            //the loop is used for initializing the arrays
            System.out.println("Enter last name: ");
            String l = scan.next();
            l = l.substring(0, 1).toUpperCase() + l.substring(1).toLowerCase();
            lastName[i] = l;
        }
scan.close();


        System.out.println("===============================================");


            for (int i = 0; i < number; i++) {//used for printing out the element in the arrays
                System.out.println(firstName[i]+" "+lastName[i]);

        }


    }

}

/*
 how many friends you have?  5,4,3 ...
String[] firstName = new String[5];
String[] lastName = new String[5];
fullName
 */

