package day38_StaticKeyword;

public class StudentsObject {

    public static void main(String[] args) {


        //System.out.println(student1.schoolName);
        //System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName); // preferred way to call

        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("ayse",18,233,'F');

        CybertekStudent student2 = new CybertekStudent();
        student2.setInfo("Almira",21,111,'F');

        System.out.println(student1);
        System.out.println(student2);

        /*
        student1.getSchoolInfo();
        student2.getSchoolInfo();
         */

        CybertekStudent.getSchoolInfo();









    }
}
