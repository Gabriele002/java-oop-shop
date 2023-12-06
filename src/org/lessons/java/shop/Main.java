package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many products in the store? ");
        int storeSize = Integer.parseInt(scan.nextLine());
        Prodotti [] products = new Prodotti[storeSize];


        for (int i = 0; i < products.length ; i++) {
            System.out.println("Products " + (i+1));
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Description: ");
            String description = scan.nextLine();
            System.out.print("Price: ");
            String price = scan.nextLine();
            double doublePrice = Double.parseDouble(price);

            Prodotti prodotti = new Prodotti(name,description,doublePrice);
            products[i] = prodotti;

        }
        System.out.println("Products list");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + " " + products[i].getDescrizione() + " " + products[i].getPrezzo());
        }











        scan.close();
    }






}
