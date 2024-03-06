package Esercizio1;

public class Esercizio1 {
    public static void main(String[] args) {


        Rettangolo rettangolo2 = new Rettangolo(8,15);
        Rettangolo rettangolo1 = new Rettangolo(6,10);
        int areaRettangolo = rettangolo1.stampaRettangolo(6,10);
        System.out.println("L'area del rettangolo è: " + areaRettangolo);

        int perimetroRettangolo = rettangolo1.stampaRettangolo1(6,10);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);

        int sommaPerimetri = rettangolo1.stampaRettangolo1(6,10) + rettangolo2.stampaRettangolo1(8,15);
        System.out.println("La somma dei perimetri: " + sommaPerimetri);
        int sommaAree = rettangolo1.stampaRettangolo(6,10) + rettangolo2.stampaRettangolo(8,15);
        System.out.println("La somma delle aree è: " + sommaAree);

    }
}
