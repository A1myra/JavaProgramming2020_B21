package day53_Collection;

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

        for (String eachKey : employeeInfo.keySet()){
            System.out.println(eachKey +"  :  " +employeeInfo.get(eachKey));
        }

    }
}
