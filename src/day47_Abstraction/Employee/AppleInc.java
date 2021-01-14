package day47_Abstraction.Employee;

public class AppleInc {

    public static void main(String[] args) {
        //Person person = new Person("Person A",28,'F') //can not create object from abstract class
        //Employee employee = new Employee("Amira",23,'F',"SDET","123",120000);
        //can not create object from abstract class

        Tester tester= new Tester("Mini",23,'F',"SDET","123",120000);
        Developer developer = new Developer("mino",23,'F',"SDET","123",100000);
        UberDriver uberDriver= new UberDriver("rinat",23,'M',"SDET","123",75000);

        tester.work();
        tester.sleep();

        developer.work();
        developer.sleep();

        uberDriver.work();
        uberDriver.sleep();

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(uberDriver);


    }
}
