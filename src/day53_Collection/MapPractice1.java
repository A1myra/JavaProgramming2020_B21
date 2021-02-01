package day53_Collection;

import day42_Inheritance.AnimalTask.Dog;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Amira",120000.5);
        employeeInfo.put("Rinat",120000.0);
        employeeInfo.put("bimbo",2000.0);

        //employeeInfo.remove("Rinat");

        System.out.println(employeeInfo.size());
        System.out.println("employeeInfo = " + employeeInfo);

        System.out.println("Salary of Amira: "+employeeInfo.get("Amira"));
        System.out.println("Salary of Amira: "+employeeInfo.get("Rinat"));

        System.out.println(employeeInfo.containsKey("Rinat")); //true
        System.out.println(employeeInfo.containsKey("bimbo")); //true
        System.out.println(employeeInfo.containsKey("simba")); //false

        System.out.println(employeeInfo.containsValue(120000.0)); //true
        System.out.println(employeeInfo.containsValue(100000.0)); //false

        //employeeInfo.clear();
        //System.out.println(employeeInfo);

        System.out.println("====================================================");

        for (String eachKey : employeeInfo.keySet()){
            System.out.println(eachKey +"  :  " +employeeInfo.get(eachKey));
        }


        System.out.println("====================================================");
        employeeInfo.put("mino",140000.0);
        employeeInfo.put("emre",120002.0);
        employeeInfo.put("riri", 50000.0);


        double max = Double.MIN_VALUE;
        String nameMax = "";

        double min = Double.MAX_VALUE;
        String nameMin ="";



        for (String eachName : employeeInfo.keySet()) {
            double eachSalary = employeeInfo.get(eachName);
            if(eachSalary > max ){
                max = eachSalary;
                nameMax = eachName;
            }

            if(eachSalary < min){
                min = eachSalary;
                nameMin = eachName;
            }
        }

        System.out.println(nameMax + " : "+max);
        System.out.println(nameMin +" : "+min);


        System.out.println("===================================================");
        System.out.println(employeeInfo);

        for (Double eachValue : employeeInfo.values()) {
            System.out.println(eachValue);
        }












    }
}
