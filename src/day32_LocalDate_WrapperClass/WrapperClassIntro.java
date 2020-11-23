package day32_LocalDate_WrapperClass;

public class WrapperClassIntro {

    public static void main(String[] args) {
        byte b = 100;
        Byte b2 = b;
        //Integer b3 = (int)b;      don't recommend this

        int i = 10;
        //Byte b3 = i; // wrapper class in onlt dedicated to its own primitives

        Integer I = 20;
        double d = I;

        Integer num = 100;
        //Long L1 = num;
        long L2 = num;

        System.out.println("==========================================");

        Character ch = 'A';
        char ch2 = ch; //unboxing
        int n = ch; //unboxing


        long score = 100;
        //Double d1=score;
    }
}
