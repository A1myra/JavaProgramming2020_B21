package Office_Hours.Practice_11_25;

public class MethodPractice {
    public static void main(String[] args) {
        divisibleBy3Between1to100();
        System.out.println("Hello");

        divisibleBy3(50,90);

        grade(90);

        eligibleToVote(18,false);

    }

    public static void divisibleBy3Between1to100(){
        for(int i = 1; i<=100; i++){
            if(i%3!=0){ //if the number is not divisible by 3
                continue; //then skip
            }
                System.out.print(i+" ");
            }
        System.out.println();
        }

    public static void divisibleBy3(int start, int end){

        if(end<=start){
            System.out.println("Invalid Numbers");
            return; //exist current method
        }
        for(int i = start; i<=end; i++){
            if(i%3!=0){ //if the number is not divisible by 3
                continue; //then skip
            }
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void grade(int score){

        if(score<0 || score>100) {
            System.out.println("Invalid score");
            return;
        }

        char grade = (score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';
        System.out.println(grade);

        switch (grade){
            case'A':
                System.out.println("Excellent, You made an A");
                break;
            case'B':
                System.out.println("Great, You made a B");
                break;
            case'C':
                System.out.println("Good, You made a C");
                break;
            case'D':
                System.out.println("You passed");
                break;

            default:
                System.out.println("You Failed");
        }

        }

        public static void eligibleToVote(int age, boolean isUSCitizen){

        if(age < 18){
            System.out.println("You must be at least 18 years old");
            return; //exits current method
        }

        if(isUSCitizen == false){
            System.out.println("you must be a US Citizen");
            return; //exits current method
        }

            System.out.println("You are eligible to vote");
        }


    }


