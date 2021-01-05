package day45_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println("hello World");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
        }finally {

        }
    }
}
