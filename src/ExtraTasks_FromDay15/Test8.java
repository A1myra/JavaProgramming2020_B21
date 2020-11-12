package ExtraTasks_FromDay15;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {

        /*- Cost can be calculated as the selling price of the product times the quantity sold,
        i.e. Cost price × quantity.
        Write a program that asks the user to enter product price and quantity and then calculate the Cost.
         If the Cost is more than 5000 a discount is 10% offered.
         Program should display the discount and discounted Cost.

	Ex: 100, 3 -> 300 --> Cost: 300, Discount: 0%
	Ex: 100, 60 -> 6000 -> Cost: 5400, Discount: 10%
         */

        Scanner result = new Scanner(System.in);

        System.out.println("Please enter product price");
        double price = result.nextDouble();
        System.out.println("Please enter quantity");
        double quantity = result.nextDouble();

        double cost = price * quantity;
        double  discountPercentage=0;
        String finalCost=" ";

        if(cost >= 5000){
            discountPercentage=10;
            cost -=(cost*(discountPercentage)/100);
        }
        finalCost="Cost: "+cost+", Discount: "+discountPercentage+"%";
        System.out.println("Final Cost: "+finalCost);



    }
}
