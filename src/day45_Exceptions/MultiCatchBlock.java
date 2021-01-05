package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try{
            System.out.println(25 / 0); //Arithmetic Exception
        } catch (NoSuchElementException e){
            System.out.println("No Such Element Exception");
        } catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }
    }
}
