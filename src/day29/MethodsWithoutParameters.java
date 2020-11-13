package day29;

public class MethodsWithoutParameters {

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Almira");
        printHello5Times();
        System.out.println("Cybertek School");
        printHello5Times();

        MethodsWithoutParameters.printHello5Times();
    }

    //AccessModifier  specifier   returnTYPE   MethodName (Parameter){
    public static void printHello5Times(){
        for(int i=1; i<=5; i++) {
            System.out.println("Hello");
        }
    }
}
/*    //step1: print hello 5 times  (for loop)
        //        step2: print your name
        //        step3: print hello 5 times  (for loop)
        //        step4: print your school name
        //        step5: print hello 5 times   (for loop
 */