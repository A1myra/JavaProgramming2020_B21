package Office_Hours.Practice_12_09_2020;

public class CybertekStudents {

    public String name;
    public int age;
    public char gender;

    public static String schoolName = "Cybertek School" , dreamJob = "SDET";;
    public static boolean hasReplIt = true , hasFlipGrid = true;

    public void setInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String toString() {
        return "CybertekStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +", School Name=" + schoolName+", has Repl.it="+hasReplIt+", has FlipGrid="+hasFlipGrid+
                ", dream job="+dreamJob+
                '}';
    }
}
