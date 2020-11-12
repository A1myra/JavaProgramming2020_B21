package Office_Hours.Practice_10_21_2020;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender: ");
        String gender = scan.next();

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Please enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Please enter your zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Please enter your country name: ");
        String country = scan.nextLine();

        System.out.println("Please enter your salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();
        System.out.println("Please enter your company name: ");
        String companyName=scan.nextLine();
//when we using nextLine after nextLine method, we don't need scan,nextLine() again.
        System.out.println("please enter your address: ");
        String address = scan.nextLine();
    }
}

/*
1. ask gender --> next()
2. ask age --> nextInt()
3. ask full name --> nextLine()
4. ask zipCode --> nextInt()
5. ask country --> nextLine()
6. ask salary --> nextDouble()
7. ask company name --> nextLine()
8. ask address --> nextLine()
/we need this extra nextLine whenever we are using nextLine() method after other scanner
 */