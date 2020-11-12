package day26_Arrays;

public class    MaximumNumberInArray {

    public static void main(String[] args) {

        int[] numbers={300,100,400,50,500,150,170};
        //

        int max = numbers[0];

        for(int i = 1; i <= numbers.length-1; i++){

            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }
}
