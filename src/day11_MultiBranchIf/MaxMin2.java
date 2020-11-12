package day11_MultiBranchIf;

public class MaxMin2 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        String maxNum = "";
        if(num1>num2 && num1>num3){
            maxNum = num1 + " : is the maximum number";
        }else if(num2>num1 && num2>num3){
            maxNum = num2 + " : is the maximum number";
        }else{
            maxNum = num3 + " : is the maximum number";
        }
        System.out.println(maxNum);

        System.out.println("================================");

        String MaximumNumber = ( num1>num2 && num1>num3)? num1 + ": is the maximum number":(num2>num1 && num2>num3)? num2 +" : is the maximum number" : num3 + " : is the maximum number";

        System.out.println(MaximumNumber);


        System.out.println("================================");

        String minNum ="";

        if(num1<num2 && num1<num3){
            minNum = num1 +" : is the minimum number";
        }else if(num2<num1 && num2<num3){
            minNum = num2 +" : is the minimum number";
        }else{
            minNum = num3 +" : is the minimum number";
        }

        System.out.println(minNum);

        System.out.println("================================");

        String MinimumNumber = (num1<num2 && num1<num3)? num1+" : is the minimum number": (num2<num1 && num2<num3) ? num2 + " : is the minimum number" : num3 + " : num 3 is the minimum number";

        System.out.println(MinimumNumber);
    }
}
/*3. write a program that can find the maximum number between three different numbers
            first solution: multi-branch if
            second solution: do not use any if statement
    4. write a program that can find the minimum number between three different numbers
            first solution: multi-branch if
            second solution: do not use any if statement
 */

