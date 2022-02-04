/*****************************************************************************************************************
 Your task is to write a program that simulates a vending machine.
******************************************************************************************************************/
import java.util.*;
//This creates a Vending class
public class VendingMachine {
    public static void main(String[] args) {
        //This creates an object of Scanner class.
        Scanner keyboard = new Scanner(System.in);

        //Write all products name of String type.
        String item1 = "Cookie";
        String item2 = "Chips";
        String item3 = "Candy";
        String item4 = "Coke";

        //take a price of product

        double cookiePrice = 2;
        double chipsPrice = 5;
        double candyPrice = 9;
        double cokePrice = 13;

        System.out.println("These snacks are available at these listed prices");
        System.out.println("Cookie = 2 \n Chips = 5 \n Candy = 9 \n Coke = 13 ");

        //User is prompted for product name
        System.out.println("Enter the product name: ");

        //User selected product stored in selectedProduct

        String selectedProduct = keyboard.nextLine();

        //User prompts to enter paid amount

        System.out.print("Enter the amount paid: $");

        double paidAmount = keyboard.nextDouble();

        keyboard.close();

        if(selectedProduct.equals(item1))

        {
            if(paidAmount >= cookiePrice)
            {
                if(paidAmount > cookiePrice)
                    System.out.println("Please take your change: $" + (paidAmount - cookiePrice));
                System.out.println("Thank you for buying " + selectedProduct);
            }

            else
            {
                System.out.println("Please take your $" + paidAmount + "it is not sufficient to buy this product");
            }
        }

        else if(selectedProduct.equals(item2))
        {
            if(paidAmount >= chipsPrice)
            {
                if(paidAmount > chipsPrice)
                    System.out.println("Please take your change: $" + (paidAmount - chipsPrice));
                System.out.println("Thank you for buying " + selectedProduct);
            }
            else
            {
                System.out.println("Please take your $" + paidAmount + "it is not sufficient to buy this product");
            }
        }

        else if(selectedProduct.equals(item3))
        {
            if(paidAmount >= chipsPrice)
            {
                if(paidAmount > candyPrice)
                    System.out.println("Please take your change: $" + (paidAmount - candyPrice));
                System.out.println("Thank you for buying " + selectedProduct);
            }
            else
            {
                System.out.println("Please take your $" + paidAmount + " it is not sufficient to buy this product");
            }
        }

        else if(selectedProduct.equals(item4))
        {
            if(paidAmount >= cokePrice)
            {
                if(paidAmount > cokePrice)
                    System.out.println("Please take your change: $" + (paidAmount - cokePrice));
                System.out.println("Thank you for buying " + selectedProduct);
            }
            else
            {
                System.out.println("Please take your $" + paidAmount + "it is not sufficient to buy this product");
            }
        }
    }
}
