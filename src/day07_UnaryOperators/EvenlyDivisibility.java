package day07_UnaryOperators;

public class EvenlyDivisibility {

    public static void main(String[] args) {

        int number = 65;
        int remainderOf2 = number % 2;  //1
        boolean DivisibleBy2 = remainderOf2 < 1;
                                   // 1 < 1

        int remainderOf3 = number % 3; //2
        boolean DivisibleBy3 = remainderOf3 < 1;
                                 //   2 < 1

        int remainderOf5 = number % 5; //0
        boolean DivisibleBy5 = remainderOf5 < 1;
                                //   0 < 1



        System.out.println(number + " is divisible by 2 :"+DivisibleBy2);
        System.out.println(number + " is divisible by 3 :"+DivisibleBy3);
        System.out.println(number + " is divisible by 5 :"+DivisibleBy5);

    }
}
/*    2. Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true

 */