package day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {
        String name = "Daniel";
        boolean isUSACitizen = true;
        int age = 29;
        boolean hasCriminalBackground = false;

        boolean eligibletovote = isUSACitizen == true && age >= 18 && hasCriminalBackground == false;
        //                        true == true   && 29 >= 18  &&  false == false
        //                          true       &&      true &&  ture
        //                                  true

        System.out.println(name+" is eligible to vote: "+eligibletovote);

        System.out.println("===============================");

        String name2 = "john";
        String c1 = "Canada";
        String c2 = "USA";

        boolean eligible = c1 == "Canada" || c2 == "USA";
        //             canada == canada     USA == USA
        //              false || true
        // true
       // as long as one is true, it will be true

        System.out.println(name2+" is eligible to vote: "+eligible);



    }
}
