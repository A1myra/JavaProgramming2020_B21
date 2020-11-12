package day18_Strings;

public class StringPractice {

    public static void main(String[] args) {

        //object

        String s1="Cat"; // save in string pool
        String s2="Cat"; // save in string pool

        System.out.println( s1==s2 );

        String s3 = new String("Cat"); // save in java heap

        System.out.println( s1==s3 ); // false, because 2 object in different memory locations
        System.out.println( s2==s3 ); // false, s2 in string pool, s3 in java heap, different memory locations.

        String s4 = new String("Cat");

        System.out.println( s3==s4 ); //false

        // equals()

        System.out.println( s1.equals(s3) ); //true
        //doesn't have to  worry about memory location, only look at text.
        System.out.println( s2.equals(s3) ); //true
        System.out.println( s3.equals(s4 )); //true

        String s5 = new String("cat");
        System.out.println( s4.equals(s5)); //false, equal methods is case sensitive
        System.out.println( s4.equalsIgnoreCase(s5));//true equalsIgnoreCase is not case sensitives

        System.out.println("====================================================");

        //Immutable

        String str ="Cybertek";
        str= str.toUpperCase(); //"CYBERTEK"

        System.out.println(str);

        str= str.toLowerCase(); //"cybertek"

        System.out.println(str);

        //char sequences -->index number, starting from 0 keep increases. should be positive number

        System.out.println("====================================================");

        String name = "Almira Hamu"; //total num of length: 11
                                    // last index:13 because index start from 0


        int n1 = name.length();

        System.out.println(n1);

        String name2 ="muhtar";

        int n2 = name2.length();//total num of length : 6
                                //last index:5
        int lastIndex = name2.length()-1; //for the last index
        System.out.println(n2);
        System.out.println(lastIndex);

        //last index: length()-1;

        System.out.println("====================================================");

        String a = "Java programming language";//to find specific character
        char firstChar= a.charAt(0);
        char lastChar = a.charAt(a.length()-1);
                        //last index num of a

        System.out.println("First character: "+firstChar);
        System.out.println("Last character: "+lastChar);

        System.out.println("====================================================");

        String b = "Today is Monday, and it's fun";

        char secondChar = b.charAt(1);
        char secondLastChar = b.charAt(b.length()-2);

        System.out.println("Second char: "+secondChar);
        System.out.println("secondLastChar = " + secondLastChar);



    }
}
