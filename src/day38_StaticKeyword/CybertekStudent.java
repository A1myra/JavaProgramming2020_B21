package day38_StaticKeyword;

public class CybertekStudent {

    public String name;
    public int age, groupNumber;
    public char gender;

    public  void setInfo(String name, int age, int groupNumber, char gender){
        this.name=name;
        this.age=age;
        this.groupNumber=groupNumber;
        this.gender=gender;
    }


    public static String schoolName = "Cybertek School";
    public static boolean isOnlineStudent = true;


    public void study(){ // instance method because used instance variable which is name
        System.out.println(name + " is studying Java");
    }

    public static void getSchoolInfo(){ //static method, because used static variables
        System.out.println("School is : " + schoolName);
    }

    @Override
    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", isOnline: "+isOnlineStudent+
                ", School Name: "+schoolName+
                '}';
    }
}
