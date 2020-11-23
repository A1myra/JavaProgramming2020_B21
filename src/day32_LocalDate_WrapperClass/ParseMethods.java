package day32_LocalDate_WrapperClass;

public class ParseMethods {

    public static void main(String[] args) {
        String data1="123";

        System.out.println(data1+3);//1233

        int num1 = Integer.parseInt(data1); // none boxing
        //           primitive == primitive

        Integer num2 = Integer.parseInt(data1);
    }
}
