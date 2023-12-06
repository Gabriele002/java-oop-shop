package org.lessons.java.shop;

import java.util.Random;

public class Prodotti {
    //ATTRIBUTI
    private int codice;
    private String name;
    private String descrizione;
    private double prezzo;
    private int iva;
    // COSTRUTTORI

    public Prodotti (int codice, String name,String descrizione,double prezzo, int iva) {
        this.codice = codice;
        this.name = name;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;

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
        return (prezzo/100)*iva + prezzo;
    }

    String namePlusCodice (){
        return name+ "-" +codice;
    }


}
