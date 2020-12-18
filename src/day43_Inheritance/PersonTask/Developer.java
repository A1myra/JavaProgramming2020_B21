package day43_Inheritance.PersonTask;

public class Developer extends Employee { //Developer IS A person. Developer IS A employee.

    /*
    inherited:
    variables: name, age, gender,hourlyRate, jobTitle, ID
    methods: eat, sleep, work, setInfo, setInfo
     */

    public Developer (String name, int age, char gender,double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }


    public void coding(){
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
