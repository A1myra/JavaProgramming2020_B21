package day45_Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {
        //StringIndexOutOfBond

        String str = "Cyberted";

        try {
        System.out.println(str.substring(200, 300));
    }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage()); // take a note, reports what exception was occurred
            e.printStackTrace();  // more information about what caused the exception
        }

        //Thread.sleep
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("Test Completed");
    }
}
