package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        //int randomNumber = rand.nextInt(1000);

        System.out.print("How many products in the store? ");
        int storeSize = Integer.parseInt(scan.nextLine());
        Prodotti [] products = new Prodotti[storeSize];


        for (int i = 0; i < products.length ; i++) {
            System.out.println("Products " + (i+1));
            int randomNumber = rand.nextInt(1000);
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Description: ");
            String description = scan.nextLine();
            System.out.print("Price: ");
            String price = scan.nextLine();
            double doublePrice = Double.parseDouble(price);
            System.out.print("Inserisci l'Iva: ");
            String iva = scan.nextLine();
            int ivaInt =  Integer. parseInt(iva);



            Prodotti prodotti = new Prodotti(randomNumber,name,description,doublePrice,ivaInt);
            products[i] = prodotti;


        }
        System.out.println("Products list:");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Codice prodoto: " + products[i].getCodice());
            System.out.println("Nome prodotto:" + products[i].getName());
            System.out.println("Nome e codice del prodotto:" + products[i].namePlusCodice());
            System.out.println("Descrizione del prodotto:" + products[i].getDescrizione());
            System.out.println("Prezzo del prodotto:" + products[i].getPrezzo() + "$");
            System.out.println("Prezzo con iva" +" " + products[i].percentualeIva()+ "$");
            for (int j = 0; j < 50; j++) {
                System.out.print("-");
            }
            System.out.println();
        }











        scan.close();
    }






}
