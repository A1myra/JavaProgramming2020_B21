package day43_Inheritance.PersonTask;

public class Developer extends Employee { //Developer IS A person. Developer IS A employee.

    public void Employee (String name, int age, char gender,double hourlyRate, String jobTitle, String ID){
        Employee(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void code(){
        System.out.println(jobTitle+" "+name+" is coding");
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }


}

/*Developer extends Employee:
        name, age, gender, hourlyRate, jobTitle, ID
        Constructor
        eat(), sleep(), work(), code()...
 */
