package day27_ForEachLoop;

public class ForEachLoop {

    public static void main(String[] args) {

        String[] name ={"Delaram","Aysel","Snoop","Ayse","Erjon"};

        for(int i=0; i<=name.length-1;i++){ // i is the index number of array
            System.out.println(name[i]);
        }

        System.out.println("================================================");

        for( String each  : name ){ // each is the element
            System.out.println(each);
        }

        System.out.println("================================================");

        int[] numbers ={1,2,3,4,5,6,7,8,9,10,11,12};

        int countEven = 0;
        int countOdd = 0;

        for(int each : numbers){
            if(each %2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("countEven = " + countEven);
        System.out.println("countOdd = " + countOdd);

        System.out.println("================================================");
        int [] scores ={10,2,3,25,5,200,-5,-2,1000,30,40,56};
        int max = scores[0];
        int min = scores[0];

        for(int each : scores){
            if(each>max){
                max = each;
            }

            if(each<min){
                min = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
