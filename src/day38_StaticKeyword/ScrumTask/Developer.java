package day38_StaticKeyword.ScrumTask;

public class Developer {

    public String name, ID, JobTitle, companyName;
    public int salary;
    public char gender;

    public static boolean hasCodingSkills = true;

    public void setInfo(String name, String ID, String jobTitle, String companyName, int salary, char gender) {
        this.name = name;
        this.ID = ID;
        JobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding (){
        System.out.println(JobTitle+" "+name+" is coding");
    }

    public void fixingBug(){
        System.out.println(JobTitle+" "+name+" is crying");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
/*
create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        hasCodingSkills,
                    Actions:
                    setInfo(), coding(),  fixingBug(), toString()

 */
