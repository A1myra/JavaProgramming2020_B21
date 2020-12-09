package Office_Hours.Practice_12_09_2020;

import day38_StaticKeyword.CybertekStudent;

public class StudentObjects {

            public static void main(String[] args) {

               CybertekStudents student1= new CybertekStudents();
               student1.setInfo("Rinat",23,'M');
                CybertekStudent.schoolName= "MIT";  // prefered way

                CybertekStudents student2 = new CybertekStudents();
                student2.setInfo("Almira",21,'F');

                System.out.println(student1);
                System.out.println(student2);


            }

        }

