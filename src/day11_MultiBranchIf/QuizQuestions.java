package day11_MultiBranchIf;

public class QuizQuestions {

    public static void main(String[] args) {

        int ivar = 100;
        double dvar = 200;
        float fvar = 300;

        ivar = (int) fvar; //explicit casting, (larger to smaller)
        fvar = ivar; //implicit casting
        dvar = fvar;//implicit casting
        fvar = (float) dvar; // explicit casting,(larger to smaller)
        dvar = ivar;//implicit casting
        ivar = (int) dvar;//explicit casting, (larger to smaller)

        int a = 3, b = 2;
        long c = (a+b) * 2 / 3 % 2;
        //   c =  5 * 2 / 3 % 2
        //   c = 10 / 3 % 2
        //   c = 3 % 2 java will take 10/3 as a int,
        //   c = 1
        System.out.println(c);






    }
}
