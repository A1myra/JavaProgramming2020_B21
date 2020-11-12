package day17_StringMemory;

public class String_Length {

    public static void main(String[] args) {

        String s ="dhfkdnvjdfhbvdfksnvjdffjfjfjfhbvjkdfsnvjhdfbv";
        String s2="Word";

        System.out.println(s.length());//45;
        System.out.println(s2.length());//4
        int len = s.length();

        System.out.println(len==s2.length());
        System.out.println(len==s.length());
    }
}
