package day48_Abstraction;

public interface InterfaceRules {


    int a = 100; // public static final by f=default
    int b= 100;

    // static{ }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(InterfaceRules.a);

        //a = 100; by default its final
    }

    void method2();

    public default  void a(){ }
}

/*
    Interface: cannot have objects
    what we can have:
        variables: public static and final by default
        static method
        default method

    what we can not have:
        constructor
        instance method
        instance variable
 */
