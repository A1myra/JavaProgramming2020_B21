package day35_CustomClass;

public class Car {

    public String brand; //instance variables
    public String model;
    public String color;
    public int year;


    public void setInfo(String cardBrand, String carModel,String carColor,int carYear){
        brand = cardBrand;
        model = carModel;
        color = carColor;
        year = carYear;
    }

    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+" "+color);

    }


}
/*

 */
