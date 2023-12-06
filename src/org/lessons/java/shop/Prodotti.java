package org.lessons.java.shop;

import java.util.Random;

public class Prodotti {
    //ATTRIBUTI
    private int codice;
    private String name;
    private String descrizione;
    private double prezzo;
    private double iva;
    // COSTRUTTORI

    public Prodotti (String name,String descrizione,double prezzo) {
        this.name = name;
        this.descrizione = descrizione;
        this.prezzo = prezzo;


    }
    //GETTER E SETTER
    public int getCodice() {
        return codice;
    }

    public String getName() {
        return name;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    //METODI
    double percentualeIva (){
        return (prezzo/100)*iva;
    }

    Random rand = new Random();
    int n = rand.nextInt(1000);
}
