package day45_Exceptions.PhoneTask;

public class HuaWei extends phone {

    public HuaWei(String model, double price) {
        super("HuaWei", model, "China", price);
    }

    public void spy(){
        System.out.println(brand+" "+model+" is spying");
    }

}
