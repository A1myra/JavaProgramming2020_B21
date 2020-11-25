package Office_Hours.Practice_11_25;

public class MethodPractice2 {

    public static void main(String[] args) {
        max(100,200);

        System.out.println(max(100,200)*2);
    }

    public static int max(int a, int b) {

        int maximum = (a >= b) ? a : b;
        System.out.println(maximum);
        return maximum;
    }

    public static int max ( int a,int b,int c){
        return max(max(a,b),c);
    }

    public static int max(int a, int b, int c, int d){
        return max(max(a,b,c),d);
    }

    /*create method for min number

    ake sure that max method also accept decimals
     */

}