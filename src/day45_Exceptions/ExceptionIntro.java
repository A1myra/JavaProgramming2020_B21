package day45_Exceptions;

public class ExceptionIntro {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

       // System.out.println(array[100]); // unexpected event ==> unchecked ==> runtime
        //如果compiler不出错是unchecked


       //Thread.sleep(2000); //unwanted event ==> checked ==> compile time
        //如果compiler出错是checked

         //check exception is where we easy to tell.


        System.out.println( 10 / 0);


        System.out.println("Test Completed");

    }
}
