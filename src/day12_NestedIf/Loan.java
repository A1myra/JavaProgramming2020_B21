package day12_NestedIf;

public class Loan {

    public static void main(String[] args) {

        double minimumSalary = 50000;
        double jobHistory = 1;
        int creditScore = 550;

        if (minimumSalary >= 30000) {

            if (creditScore >= 680) {
                System.out.println("you are qualified for loan");
            } else {
                System.out.println("you must have at least 680 credit score");
            }

        } else {
            System.out.println("you must be on the job at least for 2 years");
        }


    }
}




