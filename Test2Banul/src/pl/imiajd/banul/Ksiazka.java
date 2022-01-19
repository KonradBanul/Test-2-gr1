package pl.imiajd.banul;
import java.lang.String;

public class Ksiazka extends Autor {
    private String tytul;
    private double cena;
    public Ksiazka(String tytul, String nazwa, String email, String plec, double cena) {
        super(nazwa, email, plec);
        this.tytul = tytul;
        this.cena = cena;
    }
    public String getTytul() {
        return tytul;
    }
    public double getCena() {
        return cena;
    }
    public int compareTo(Ksiazka a) {
        String jeden = getTytul() + getCena();
        String dwa = a.getTytul() + a.getCena();
        return jeden.compareTo(dwa);
    }
    public String toString() {
        return "Ksiazka[tytul = " + tytul + ", cena = " + cena + "]";
    }
}
