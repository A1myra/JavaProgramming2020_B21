package day10_IfElseStatement;

public class MinimunNumber {

    public static void main(String[] args) {
        int n1= 100;
        int n2= 200;
        int n3= 300;

        boolean n3IsMin = n3< n1 && n3<n2; // if n3 is less than both n1&n2, it mean n3 is the minimum number.
        boolean n2IsMin = !n3IsMin && n2<n1; //if n3 is not max number and n2 is less than n1.
        //n2<n1 && n2<n3;
        boolean n1IsMin = !n3IsMin && !n2IsMin;//if n3 is not min and n2 is not min either.
        //n1<n2 && n1<n3

        String str = " is the minimum number";
        int min = 0;

        if(n3IsMin){
           // System.out.println(n3+str);
            min = n3; // we are not just finding the minimum number, but also making it to be reusable.
        }
        if (n2IsMin) {
           // System.out.println(n2+str);
            min = n2;
        }
        if(n1IsMin){
            //System.out.println(n1+str);
            min = n1;
        }
        System.out.println(min + str);

    }
}
/*Task03: MinimumNumber
         write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal

 */