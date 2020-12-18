package day43_Inheritance.PersonTask;

public class AppleInc { //AppleInc HAS A Tester.
                        //AppleInc HAS A Developer.

    public static void main(String[] args) {

        Tester tester1 = new Tester("Rinat",23,'M',45,"Senior Developer","123K");
        tester1.eat();
        tester1.sleep();
        tester1.work();
        System.out.println("Salary "+tester1.calcSalary());
        tester1.testing();

        System.out.println(tester1);

        Developer developer1 = new Developer("Bimbo",21,'F',50,"Senior developer","321K");
        developer1.eat();
        developer1.sleep();
        developer1.work();
        developer1.coding();
        System.out.println("Salary "+developer1.calcSalary());

        System.out.println(developer1);



    }


}
