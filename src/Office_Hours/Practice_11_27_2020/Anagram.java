package Office_Hours.Practice_11_27_2020;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        /*
        str1 = Listen
        str2 = Silent
         */
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toUpperCase(); //LISTEN
        str2 = str2.toUpperCase(); //SILENT


        str1=sort(str1);
        str2=sort(str2);

        System.out.println(str1.equals(str2));

        System.out.println("=======================================");
        String s1="Listen";
        String s2="Silent";

        s1=s1.toLowerCase(); //listen
        s2=s2.toLowerCase(); //silent

        String[] arr1 = s1.split(""); //[l.i,s,t,e,n]
        String[] arr2 = s2.split(""); //[s,i,l,e,n,t]

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1,arr2);
        System.out.println(isAnagram);

    }


    //"dcba"
        public static String sort(String str){
        String result = "";
        char[] ch = str.toCharArray(); //[d,c,b,a]
            Arrays.sort(ch); //[a,b,c,d]
            for(char each : ch){
                result+=each;
            }

            return result;

        }
    }

