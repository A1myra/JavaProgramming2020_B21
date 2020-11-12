package day08_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {


        int a = 10;
        System.out.println(a); //10
        a=30;
        System.out.println(a); //30

        String schoolName = "Cybertek";
        schoolName = "MIT"; //always will choose the second one, top to bottom
        System.out.println(schoolName);

        int x = 100; // 100 - 62 = 38
        x -= 62; //x = x-62; -->38
        System.out.println(x);

        double salary = 100000;  //0.28 Tax
        salary -= salary * 0.28; //salary after tax
        //or
        // salary -== 28000;
        //salary == salary - 28000 = 72000;
        System.out.println(salary);

        int x2 = 999999;
        x2 -= 25;
        System.out.println(x2);

        double balance = 2000;
        balance -= 450; // means: balance = balance - 450
        System.out.println(balance);
        balance -= 1000;
        System.out.println(balance);

        //depositing
        balance += 5000;
        System.out.println(balance);


        int y2 = 400;
        y2 += 10000 * 0.1;
        System.out.println(y2);

        String name = "Cybertek";
        name += " School" ;
        System.out.println(name);

        double totalTax = 100000;
        totalTax *= 0.28; // totaltax = 100000 * 0.28
        System.out.println(totalTax);

        int  bonus = 5000;
        bonus *= 2; //5000 * 2
        System.out.println(bonus);

        int y3 = 10;
        y3 /= 5;
        System.out.println(y3);


        int house = 500000;
        int month = 240;
        double monthlypayment= house;
        monthlypayment /= month;
        System.out.println(monthlypayment);

        //100 / 3; =====> 99.33333 =====> remainder : 1
        int a2 = 100;
            a2 %= 3; // a2 = 100 % 3;
        System.out.println(a2);











    }
}
