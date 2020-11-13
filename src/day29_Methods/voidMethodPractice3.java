package day29_Methods;

public class voidMethodPractice3 {

    public static void main(String[] args) {

     eligibleToVote("USA",45,true);

     eligibleToVote("Japan",45,true);

        eligibleToVote("USA",15,true);


    }

    public static void eligibleToVote(String CitizenShip, int age, boolean IsAlive){
        if(CitizenShip.equalsIgnoreCase("USA")){
            if(IsAlive){
                if(age>=18){
                    System.out.println("you are eligible to vote");
                }else{
                    System.err.println("To be eligible, you must be at least 18 years old");
                }

            }else{
                System.err.println("You must be alive in order to vote");
            }


        }else{
            System.err.println("You must be US Citizen");
        }


    }


}
/*
1. CitizenShip,age, isAlive
*/
