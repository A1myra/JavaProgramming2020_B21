package day07_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 100;
        boolean isPositive = a > 0;//verify if a is positive
        boolean isNegative = a < 0;//verify if a is negative

        System.out.println(a+" is positive: "+isPositive);
        System.out.println(a+" is negative: "+isNegative);

        int b = -100 - 20; //-120
        System.out.println(b);
        int c  = 10 - -20; //负负得正
                // 10 + 20 = 30

        int d = 10 * 4; //-40
        int e = 10 * -4; //-40
        int f = -10 * -4; //40

        System.out.println("===================================");
        //  PRE:
        int x = 100;
        ++x; //101 ==> increase value by 1, 100+1=101
        System.out.println(x);

        int y = 100;
        --y; //99 ==> decrease value by 1, 100-1=99
        System.out.println(y);


        int z = 100;
        System.out.println(--z); //99

        int x2 = 100;
        System.out.println(++x2); //101

        System.out.println("==================================");
        //  POST:

        int a2 = 100;
        System.out.println(a2++); //100
        System.out.println(a2);//101

        int b2 = 100;
        System.out.println(b2--); //100
        System.out.println(b2);//99 decrease by 1





    }
}
