package day32_LocalDate_WrapperClass;

public class ParseMethods {

    public static void main(String[] args) {
        String data1="123";

        System.out.println(data1+3);//1233

        int num1 = Integer.parseInt(data1); // none boxing
        //           primitive <== primitive int

        Integer num2 = Integer.parseInt(data1); //Autoboxing
        //wrapper class <== primitive

        System.out.println(num1+3);

        String s1 = "Hello";

        //int num3 = Integer.parseInt(s1);
        //System.out.println(num3);

        String s2 = "2.5";

        double d1 = Double.parseDouble(s2); //none boxing
                // primitive<===primitive
        Double d2=Double.parseDouble(s2); //Autoboxing
        //Wrapper class<==  primitive
        System.out.println(d1+1);


        String s3 = "true";
        boolean b1=Boolean.parseBoolean(s3); // none boxing
        Boolean b2 = Boolean.parseBoolean(s3); //Autoboxing
        System.out.println(b1);
        System.out.println(!b1);


    }
}
