package day17_StringMemory;

import java.util.Scanner;

public class Scanner_Review2 {
    /* Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their first name (String, single word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String productName=input.nextLine();

        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity= input.nextInt();

        System.out.println("Enter your first name:");
        String firstName = input.next();


        System.out.println(productName);
        System.out.println(price);
        System.out.println(quantity);
        double TotalCost = price*quantity;


        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been placed. Your total is "+TotalCost+".");

    }
}
