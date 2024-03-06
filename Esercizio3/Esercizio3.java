package Esercizio3;

public class Esercizio3 {
    public static void main(String[] args) {

        Articolo prodotto1 = new Articolo(56, "Mouse Logitech G502", 120.50, 5);
        System.out.println("Codice articolo: " + prodotto1.getCodiceArticolo() );
        System.out.println("Descrizione: " + prodotto1.getDescrizione() );
        System.out.println("Prezzo: " + prodotto1.getPrezzo() + " euro" );
        System.out.println("Numero di pezzi disponibili: " + prodotto1.getNumeroPezzi());

        Cliente cliente1 = new Cliente(250, "Roberta Stira", "stira.roberta@yahoo.it","06/03");
        System.out.println("Codice cliente: " + cliente1.getCodicecliente());
        System.out.println("Nome e Cognome: " + cliente1.getNomeECognome() );
        System.out.println("Email: " + cliente1.getEmail());
        System.out.println("Data iscrizione: " + cliente1.getDataIscrizione());




    }
}
