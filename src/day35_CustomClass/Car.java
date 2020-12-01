package day35_CustomClass;

public class Car {

    public String brand; //instance variables
    public String model;
    public String color;
    public int year;
    public double price;


    public void setInfo(String cardBrand, String carModel,String carColor,int carYear,double carPrice){
        brand = cardBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public void getInfo(){
        System.out.println(year+" "+brand+" "+model+" "+color+" "+price);

    }


}
/*

 */
