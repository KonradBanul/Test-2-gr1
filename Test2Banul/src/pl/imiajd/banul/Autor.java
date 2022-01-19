package pl.imiajd.banul;
import java.lang.Comparable;
import java.lang.Cloneable;
import java.lang.String;

public class Autor implements Comparable<Autor>, Cloneable {
    private String nazwa;
    private String email;
    private String plec;
    public Autor(String nazwa, String email, String plec) {
        this.nazwa = nazwa;
        this.email = email;
        this.plec = plec;
    }
    public String getNazwa() {
        return nazwa;
    }
    public String getEmail() {
        return email;
    }
    public String getPlec() {
        return plec;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPlec(String plec) {
        this.plec = plec;
    }
    public int compareTo(Autor a) {
        String jeden = getNazwa() + getPlec();
        String dwa = a.getNazwa() + a.getPlec();
        return jeden.compareTo(dwa);
    }
    public String toString() {
        return "Autor[nazwisko = " + nazwa + ", email = " + email + ", plec = " + plec + "]";
    }

}
