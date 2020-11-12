package day27_ForEachLoop;

public class UniqueIntegers2 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4};

        // how many time 1 occured in the array

        for (int element : arr) {

            int frequency = 0; // is the frequency of element

            for (int each : arr) {
                if (each == element) {
                    frequency++;
                }
            }
        if(frequency==1){
            System.out.print(element+" ");
        }

        }
    }
}
