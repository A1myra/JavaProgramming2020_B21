package day28_MultiDimensionalArray;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] employeeNames ={"Rinat","Almira","Daniyar","Aynigar","Erpan" };
        //          index numbers: 0        1         2         3        4
        int[]  employeeSalary ={100000,110000,105000,120000,115000 };
        //      index numbers:     0      1      2      3      4

        int max  = employeeSalary[0];
        String maxName ="";

        int min = employeeSalary[0];
        String minName ="";

        for(int i=0; i<=employeeNames.length-1;i++){ // i: 0,1,2,3,4
            System.out.println(employeeNames[i]+" : $" + employeeSalary[i]);

            if(employeeSalary[i] > max){
                max = employeeSalary[i];
                maxName=employeeNames[i];
            }

            if(employeeSalary[i] < min){
                min = employeeSalary[i];
                minName=employeeNames[i];
            }

        }

        System.out.println(maxName+" has the maximum salary: $ "+max);

        /*
        john: $100000
           ....

           who has the highest salary
           who has the minimum salary
         */

    }
}
