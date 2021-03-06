package day45_Exceptions.PhoneTask;

public class phone extends Device {

    public phone(String brand, String model, String country, double price) {
        super(brand, model, country, price);
    }

    public String toString() {
        return "phone"+super.toString();
    }

    public void call(long number){
        System.out.println(brand+" "+model+" is calling "+number);
    }

    public void text(long number){
        System.out.println(brand+" "+model+" is texting "+number);
    }


}

/*
create a class called phone:
                attributes: brand, model, price, country
                methods: call, text,  toString
 */


