package day05_Concatenation;

public class EmployeeInfo {

    //1. create a class named EmployeeInfo
    //                declare the following variables:
    //                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
    //            write a program that can display the full info of the employee
    //                    ex:
    //                             firstName = John
    //                             lastName = Daniel
    //                             gender = M
    //                             age = 35
    //                             companyName = CapitalOne
    //                             jobTitle = SDET
    //                             isFullTime = true
    //                             isMarried = false
    //                             salary = 120000.50
    //
    //             output:
    //                        Employee' full name is: John Daniel
    //                        John Daniel' gender is: M
    //                        John Daniel' age is: 35 years old
    //                        John Daniel works at: CapitalOne
    //                        John Daniel' Job title is: SDET
    //                        John Daniel' salary is 120000.5 $
    //                        John Daniel is full time employee: true
    //                        John Daniel is married: false

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






        System.out.print("Employee's full name is : ");
        System.out.println(fullName);

        System.out.print(fullName);
        System.out.print("' gender is: ");
        System.out.println(Gender);

        System.out.print(fullName);
        System.out.print("' age is : "); //be careful about the ln, to print them right after.
        System.out.print(age);
        System.out.println(" years old");

        System.out.print(fullName);
        System.out.print(" works at : ");
        System.out.println(CompanyName);

        System.out.print(fullName);
        System.out.print("' Job Title is: ");
        System.out.println(JobTitle);

        System.out.print(fullName);
        System.out.print("' salary is: $");
        System.out.println(salary);

        System.out.print(fullName);
        System.out.print("' is fulltime employee : ");
        System.out.println(fulltime);

        System.out.print(fullName);
        System.out.print(" is married : ");
        System.out.println(isMarried);









    }
}
