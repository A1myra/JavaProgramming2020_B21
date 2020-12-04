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
        System.out.println(student1);
        student1.getInfo();



    }
    }

