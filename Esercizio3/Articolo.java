package Esercizio3;

public class Articolo {
    private int codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int numeroPezzi;

    public Articolo(int codiceArticolo, String descrizione, double prezzo, int numeroPezzi) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezzi = numeroPezzi;

    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumeroPezzi() {
        return numeroPezzi;
    }
}
