package day31_MethodOverLoading;

public class MethodOverloading3 {

    public static int max(int[] arr){
        int max =arr[0];
        for( int each  : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static double max(double[] arr){
        double max=arr[0];
        for(double each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }


    public static int min(int[] arr){
        int min = arr[0];

        for(int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
     public static double min(double[] arr){
        double min = arr[0];

        for(double each : arr){
            if(each<min){
                min=each;
            }
         }
        return min;
     }

}
