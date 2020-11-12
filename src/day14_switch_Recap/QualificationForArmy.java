package day14_switch_Recap;

public class QualificationForArmy {


    public static void main(String[] args) {

        String citizen = "Canada";
        boolean isResident = false;
        boolean isAlien = true;

        boolean hasHighSchoolDiploma = true;
        int numberofdependants = 3;

        int age = 13;

        if (citizen == "USA || isResident || isAlien") {

            if (age >= 17 && age <= 34) {

                if (hasHighSchoolDiploma) {

                    if (numberofdependants<=2) {

                        System.out.println("you are qualified for the US army");
                    }else{
                        System.err.println("you must have no more than two dependents");
                    }
                } else {
                    System.err.println("you must have high school diploma");
                }


            } else {
                System.err.println("your age must be between 17 to 34 years old");
            }

        }else {
            System.err.println("you must be a US citizen or a resident or alien.");
        }
    }
}
