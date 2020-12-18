package day43_Inheritance.PersonTask;

public class Employee extends Person {


    public double hourlyRate;
    public String jobTitle, ID;


    public void work(){
        System.out.println(name+" is working");
    }

    public void setInfo(String name, int age, char gender,double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender);
        this.hourlyRate=hourlyRate;
        this.ID=ID;
        this.jobTitle=jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "hourlyRate= $" + hourlyRate +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
/*Employee extends Person:
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
 */