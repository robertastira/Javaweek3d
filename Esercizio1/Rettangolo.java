package Esercizio1;

public class Rettangolo {
    int altezza;
    int base;


    public Rettangolo(int altezza, int base) {
        this.altezza =  altezza;
        this.base = base;
    }

    public int stampaRettangolo(int altezza, int base){
        return (base*altezza);
    }
    public int stampaRettangolo1(int altezza, int base){
        return((2*base)+(2*altezza));
}
}