package day43_Inheritance.PersonTask;

public class Employee extends Person { //Employee IS A person.


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

    public double calcSalary(){
        return hourlyRate * 40 * 52;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "hourlyRate= $" + hourlyRate +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary= $'"+ (int)calcSalary()+'\''+
                '}';
    }

    public static String publicVariable = "Public";
    protected static String protectedVariable = "Protected";
    static String defaultVariable = "Default";
}
/*Employee extends Person:
        name, age, gender, hourlyRate, jobTitle, ID
        setInfo, eat(), sleep(), work()
 */