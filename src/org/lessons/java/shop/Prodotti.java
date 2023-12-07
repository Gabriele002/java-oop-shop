package org.lessons.java.shop;

import java.util.Random;

public class Prodotti {
    //ATTRIBUTI
    private int codice;
    private String name; // non deve essere un valore nullo
    private String descrizione;  // non deve essere un valore nullo
    private double prezzo;  // non deve essere negativo
    private int iva; // non deve essere negativo
    // COSTRUTTORI

    public Prodotti (int codice, String name,String descrizione,double prezzo, int iva) throws IllegalArgumentException{
        this.codice = codice;
        this.name = name;
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("name must not be empty");
        }
        this.descrizione = descrizione;
        if(descrizione == null || descrizione.isEmpty()){
            throw new IllegalArgumentException("description must not be empty");
        }
        this.prezzo = prezzo;
        if(prezzo < 0){
            throw new IllegalArgumentException("price must be >= 0");
        }
        this.iva = iva;
        if(iva < 0){
            throw new IllegalArgumentException("iva must be >= 0");
        }

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
