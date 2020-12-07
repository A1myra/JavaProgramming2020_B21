package day38_StaticKeyword.ScrumTask;

public class Tester {

    public String name, ID, jobTitle;
    public double salary;
    public char gender;


    public void setInfo(String name, String ID, String jobTitle, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting(){
        System.out.println(name + " is performing smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
/*
create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        isHuman, isCybertekStudent
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
 */
