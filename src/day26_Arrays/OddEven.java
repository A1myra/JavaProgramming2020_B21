package day26_Arrays;

import java.util.Arrays;

public class OddEven {

    public static void main(String[] args) {
        int[] numbers = new int[100];
        //                  last index:99

        //1~100

        for (int i = 0; i <= 99; i++) { //i : 0~99
            numbers[i] = i + 1;
            /*
            numbers[0] = 0; expected: 1
            numbers[1] = 1; expected: 2
            numbers[2] = 2; expected: 3 that's why we need i+1
             */
        }
        System.out.println(Arrays.toString(numbers));


    /* requirement:
    1. how many even number in the array
    2. how many odd numbers in the array
    3. how many numbers can be  evenly  divisible by 3?
    4. how many numbers can be even ly divisible by 5?
     */

        int countEven = 0;
        int countOdd=0;
        double count3=0;
        double count5=0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int eachNumber = numbers[i]; //eachNumber: 1,2,3,4....100
            if(eachNumber%2==0){
                countEven++;
            }else{
                countOdd++;
            }
            if(eachNumber%3==0){
                count3++;
            }else if(eachNumber%5==0){
                count5++;
            }

        }

        System.out.println("Even Numbers: " + countEven);
        System.out.println("Odd Numbers: " + countOdd);
        System.out.println("Divisible by 3: " + count3);
        System.out.println("Divisible by 5: " + count5);
    }
}