package day09_IfStatement;

public class OddOrEven {
    public static void main(String[] args) {


        System.out.println("==========================");

        System.out.println( false == !true);
        //                 false == false ==>true

        System.out.println(false != true && !false  == true);
        //                  true && true ==>  true

        System.out.println(!false != false|| false);
        //                  true != false ==> true

        System.out.println(!false != false && false ); // false

        System.out.println(true &&  true && true&& false);//false

        System.out.println(false || false || false || false || true);//true

        System.out.println("=======================================");

        String weather = "shinny";
        int degree = 70;

        boolean r1 = !(weather =="rainy" || degree == 70);
        //           ! shinny == rainy   || 70 == 70
        //              !false || true
        //              !true
        System.out.println(r1);

        /*
        !no ==> yes
        !yes ==> no

        !funny ==> not funny
         */
        System.out.println(!!true);//true
        System.out.println(!!!false); //true
        System.out.println(!!!!false); // false
    }
}
