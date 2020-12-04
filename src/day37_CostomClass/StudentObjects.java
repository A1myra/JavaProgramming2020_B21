package day37_CostomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String("Batch 21");
        Student student1 = new Student();

        student1.setInfo("Almira",'F', LocalDate.of(1999,2,23),"1234567",4.5);
        System.out.println(list);
        System.out.println(str);

        System.out.println(student1.toString());
        System.out.println(student1);

        System.out.println("=============================================================");
        Student student2 = new Student();
        student2.setInfo("Rinat",'M',LocalDate.of(1997,11,17),"B123",3.5);

        //students2.getInfo();

        System.out.println(student2);

        System.out.println("=============================================================");
        Student student3 = new Student();
        student3.setInfo("Ayni",'F',LocalDate.of(1998,8,12),"A007",4.0);
        System.out.println(student3);

        System.out.println("=============================================================");

        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(student1,student2,student3));

        System.out.println(studentList);

        System.out.println("=============================================================");

        Student[] students={student1,student2,student3};

        System.out.println(Arrays.toString(students));

        System.out.println("=============================================================");

        //find the students who has ID number of A007

        for(Student each : students){
            if(each.ID.equals( "A007")){
                System.out.println(each);
            }
        }




    }
    }

