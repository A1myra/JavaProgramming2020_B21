package Office_Hours.Practice_10_28_2020;

public class FrequencyOfACharacter {

    public static void main(String[] args) {
//找出里面有多少个a
        String str = "abaacaaaaaaaaaa";
        char ch = 'a';

        int count = 0;
        for(int i = 0; i <= str.length()-1; i++){

            char eachChar = str.charAt(i); //a,b,a,a,c

            if(eachChar==ch){
                        //a
                count++;
            }
        }

        System.out.println("count = " + count);


    }
}
