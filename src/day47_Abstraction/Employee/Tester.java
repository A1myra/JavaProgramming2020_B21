package day47_Abstraction.Employee;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    public void work(){
        System.out.println("Tester is testing teh application");
    }

    public void sleep(){
        System.out.println("Tester usually sleeps 7 hours");
    }

    public void smokeTesting(){
        System.out.println("smoke testing");
    }


}
