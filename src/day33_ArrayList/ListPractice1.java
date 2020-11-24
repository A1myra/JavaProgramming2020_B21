package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i=0; i<= 100; i++){
            if(i%2==0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

        System.out.println("Last odd number: "+odd.get(odd.size()-1));
        System.out.println("Last even number: "+even.get(even.size()-1));
    }
}
