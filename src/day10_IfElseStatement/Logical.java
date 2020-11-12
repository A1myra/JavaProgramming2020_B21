package day10_IfElseStatement;
// logical operators : ||,&&,!
public class Logical {

    public static void main(String[] args) {

        // ||:returns false if all expressions are false.
        //F+F=F; otherwise it always returns us true.

        boolean r1 = 10 < 9 || 20 != 20;
                    //false ||  false
                    //false
        System.out.println(r1);

        boolean r2 = "Muhtar"=="Good guy" || "Muhtar"!="Bad guy";
                        //false          ||  true
                        // true
        System.out.println(r2);

        boolean r3= 'a' != 'A' || 'B'=='B';
                    //true     ||   true
                    //true
        System.out.println(r3);


    }

}
