package day40_Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){
        //this(); //CAN NOT call it self
    }

    public ConstructorCall2 (int a ){
        this();
    }
}
