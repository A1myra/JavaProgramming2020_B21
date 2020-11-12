package day09_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "John";
        String citizen = "USA";

        boolean eligible = citizen == "USA";
        System.out.println(name+" is eligible to vote for trump or biden?\n\t"+eligible);


        System.out.println("=================================");

        String name2 = "Aaron";
        boolean isUsCitizen = false;

        boolean eligibletovote = isUsCitizen == true;
        //                          false   ==  true;
        //                                  false;
        System.out.println(name2+" is eligible to vote for trump or biden?\n\t"+eligibletovote);


    }
}
/* 2. write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
        Ex:
            name = "John"
            citizenShip = "USA"
            output:
                John is eligible to vote for Donald Trump or Joe Biden?
                    true

 */