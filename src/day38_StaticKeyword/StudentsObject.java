package day38_StaticKeyword;

public class StudentsObject {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        student1.setInfo("ayse",18,233,'F');

        System.out.println(student1);


        CybertekStudent student2 = new CybertekStudent();

        //System.out.println(student1.schoolName);
        //System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName); // preferred way to call








    }
}
