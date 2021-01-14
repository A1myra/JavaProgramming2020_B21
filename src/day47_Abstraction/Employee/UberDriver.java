package day47_Abstraction.Employee;

public class UberDriver extends Employee{

    public UberDriver(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    void work() {
        System.out.println("Driving uber");
    }

    @Override
    public void sleep() {
        System.out.println("Uber drivers usually sleeps 9 hours");
    }
}
