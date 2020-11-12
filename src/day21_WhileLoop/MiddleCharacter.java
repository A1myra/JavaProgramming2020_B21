package day21_WhileLoop;

public class MiddleCharacter {

    public static void main(String[] args) {

        String word = "Cybertek"; //3/2=1
        //              "javav" // 5/2=2

        if (word.length() % 2 != 0) { //odd number of characters


            //first requirement
            if (word.length() >= 3) { // if it has 3 or more characters
                System.out.println(word.charAt(word.length() / 2));
                //second requirement
            } else{ // has 1 char only
                System.out.println(word + word + word);
            }

        } else {//even number of characters
            //"java: ==>av==>1,2 index
            //"apples"==>pl==>2,3 index
            //"Cybertek ==> er==> 3,4 (length /2)

            if (word.length() >= 4) { //have 4 or more chars
                int m = word.length()/2;
                System.out.println(word.charAt(m-1)+""+word.charAt(m));
            }else{ // for 2 chars
                System.out.println(word+word);
            }


        }
    }
}


/*1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq
2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi
 */