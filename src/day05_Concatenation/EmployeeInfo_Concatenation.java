package day05_Concatenation;

public class EmployeeInfo_Concatenation {

    public static void main(String[] args) {

        String firstName = "john"; //""for the texts
        String lastName = "Daniel";
        String fullName = firstName + " " + lastName;
        char Gender = 'M'; // ''for single characters only
        int age = 35;
        String CompanyName = "CapitalOne";
        String JobTitle = "SDET";
        double salary = 120000.5;
        boolean fulltime = true;
        boolean isMarried = false;

        System.out.println("Employee's full name is: "+fullName);
        System.out.println(fullName+"'s gender is: "+Gender);
        System.out.println(fullName+"'s age is: "+age+" years old");
        System.out.println(fullName+" works at: "+CompanyName);
        System.out.println(fullName+"'s Job Title is: "+ JobTitle);
        System.out.println(fullName+"'s salary is: $"+salary);
        System.out.println(fullName+" is fulltime employee: "+fulltime);
        System.out.println(fullName+" is married: "+isMarried);
    }
}

////1. create a class named EmployeeInfo
//    //                declare the following variables:
//    //                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
//    //            write a program that can display the full info of the employee
//    //                    ex:
//    //                             firstName = John
//    //                             lastName = Daniel
//    //                             gender = M
//    //                             age = 35
//    //                             companyName = CapitalOne
//    //                             jobTitle = SDET
//    //                             isFullTime = true
//    //                             isMarried = false
//    //                             salary = 120000.50
//    //
//    //             output:
//    //                        Employee' full name is: John Daniel
//    //                        John Daniel' gender is: M
//    //                        John Daniel' age is: 35 years old
//    //                        John Daniel works at: CapitalOne
//    //                        John Daniel' Job title is: SDET
//    //                        John Daniel' salary is 120000.5 $
//    //                        John Daniel is full time employee: true
//    //                        John Daniel is married: false