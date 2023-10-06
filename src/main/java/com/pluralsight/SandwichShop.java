package com.pluralsight;
import java.util.*;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("What size sandwich? ");
        String size = myScanner.nextLine();

        double price1 = 5.45;

        if (size.equals( "Regular")){price1 = 5.45;
        System.out.println("Price for Regular Sandwich: " + price1);}

        double price2 = 8.95;

        if (size.equals("Large")){price2 = 8.95;
        System.out.println("Price for Large Sandwich: " +price2);}

        System.out.println("What is your age?");
        int age = myScanner.nextInt();

         double price1sd = (price1 - (price1 * .10));
         double price1ed = (price1 - (price1 * .20));
         double price2sd = (price2 - (price2 * .10));
         double price2ed = (price2 - (price2 * .20));

        if (age <= 17 && size.equals("Regular")){price1sd = price1 - (price1 * .10);
        System.out.printf("price after student discount: " + "%.2f", price1sd);}

        if (age >= 65 && size.equals("Regular")){price1ed = price1 - (price1 * .20);
        System.out.printf("price after senior discount: " + "%.2f", price2ed);}

        if (age <= 17 && size.equals("Large")){price2sd = price2 - (price2 * .10);
        System.out.printf("price after student discount: " + "%.2f", price2sd);}

        if (age >= 65 && size.equals("Large")){price2ed = price2 - (price2 * .20);
        System.out.printf("price after senior discount: " + "%.2f", price2ed);}


    }
}
