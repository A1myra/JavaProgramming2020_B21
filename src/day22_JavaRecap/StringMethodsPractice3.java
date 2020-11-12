package day22_JavaRecap;

public class StringMethodsPractice3 {
    public static void main(String[] args) {

//replace
        String sentence = "Capital of Canada is Washington";
        sentence=sentence.replace("Canada","United States");
        System.out.println(sentence);

//replaceFirst
        String s = "Cybertek School is in Boston, Cubertek Campus is in Mclean";
        s = s.replaceFirst("Cybertek","MIT");
        System.out.println(s);

        String r = "cava is cool programming language, I like to learn cava at cybertek school";
        r= r.replace("cav","Jav");
        System.out.println(r);

        String p = "I like Java and Java Java Java Java Java Java";
        p = p.replaceFirst("Java","C#");
        p = p.replaceFirst("Java","java");
        p = p.replace("Java","");
       // p = p.replace("Java","").replace("like ","like Java");

        System.out.println(p);

        System.out.println("================================================");

//trim
        //trim: remove white space only, which is space before or end.

        String str = "                       ";

        System.out.println(str.length());
        str=str.trim();
        System.out.println(str.length());

        String str2 = "                cybertek        school         ";
        System.out.println(str2);
        str2=str2.trim();
        System.out.println(str2);

        System.out.println("================================================");

//contains,isEmpty,startsWith,endWith

        String s2="I like to learn Java";
        System.out.println("Contains c#"+ s2.toLowerCase().contains("java"));
        //看句子里面有没有c#.如果在 true，如果不在 false.
        System.out.println(s2.equals("java")); //false ==> word!=sentence
        System.out.println(s2.equalsIgnoreCase("java"));//false==>word!=sentence

        System.out.println("================================================");

        String s3="Cybertek School is the best";
        System.out.println(s3.contains("cybertek"));//false==>case!!!
        System.out.println(s3.toLowerCase().contains("cybertek"));// true==>ignore case sensitivity!

        System.out.println(s3.equals("cybertek"));//false! word!=sentence
        System.out.println(s3.equalsIgnoreCase("cybertek"));//false! word!=sentence

//isEmpty
//isEmpty: is the length is 0, its true.
        System.out.println("Java".isEmpty());//false
        System.out.println("".isEmpty());//true

        System.out.println("================================================");

//startsWith, endsWith
        String URL = "http://www.amazon.com"; //.com, .gov, .edu

        boolean isValid = URL.startsWith("http") && (URL.endsWith(".com") || URL.endsWith(".edu") || URL.endsWith(".gov"));

        if(isValid){
            System.out.println("URL is valid");
        }else{
            System.out.println("Invalid");
        }

        /*
        valid emails: gmail, hotmail, yahoo, outlook
         */

        String email ="Java_yahoo@java.com";

        boolean validEmail=email.endsWith("gamil.com") || email.endsWith("yahoo.com")
                        || email.endsWith("hotmail.com")  || email.endsWith("outlook.com");

        if(validEmail){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }







    }

}
