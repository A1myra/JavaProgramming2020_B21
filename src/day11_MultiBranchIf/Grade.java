package day11_MultiBranchIf;

public class Grade {
    public static void main(String[] args) {
        int score = 20;

        if(score >=90) {
            System.out.println("Grade : A");
        }else if(score >= 80 && score < 90){
            System.out.println("Grade : B");
        }else if(score >= 70 && score < 80){
            System.out.println("Grade : C");
        }else if(score >= 60 && score < 70){
            System.out.println("Grade : D");
        }else{
            System.out.println("Grade : F");
        }

        System.out.println("=================================");

        char grade2 = ' ';
        if(score >=90) {
            grade2 = 'A';
        }else if(score >= 80 && score < 90){
            grade2 = 'B';
        }else if(score >= 70 && score < 80){
            grade2 = 'C';
        }else if(score >= 60 && score < 70){
            grade2 = 'D';
        }else{
            grade2 = 'F';
        }
        System.out.println("Your grade is : "+grade2);

    }
}
