package MyOwnPackage;

import org.w3c.dom.ls.LSOutput;

public class Reverse {


    /*
    reverse ABCD to DCBA
     */

    public static void main(String[] args) {
        reverse("ABCD");
    }

    public static void reverse(String str){
        String result="";

        for(int i=str.length()-1; i>=0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

    }

}