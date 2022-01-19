package pl.imiajd.banul;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> c = new ArrayList<>();
        ArrayList<Object> d = new ArrayList<>();
        ArrayList<Object> e = new ArrayList<>();
        ArrayList<Object> f = new ArrayList<>();
        c.add(new Autor("Lem", "nema@wp.pl", "kobieta"));
        System.out.println(c);
        d.add(new Autor("Lem", "lem@wp.pl", "mezczyzna"));
        System.out.println(d);
        e.add(new Autor("Szym", "szym@wp.pl", "kobieta"));
        System.out.println(e);
        f.add(new Autor("Wis", "wis@wp.pl", "mezczyzna"));
        System.out.println(f);
        ArrayList<Object> g = new ArrayList<>();
        ArrayList<Object> h = new ArrayList<>();
        ArrayList<Object> i = new ArrayList<>();
        ArrayList<Object> j = new ArrayList<>();
        g.add(new Ksiazka("Powrot", "Lem", "lem@wp.pl", "mezczyzna", 32));
        System.out.println(g);
        h.add(new Ksiazka("Wstep", "Szym", "szym@wp.pl", "kobieta", 43));
        System.out.println(h);
        i.add(new Ksiazka("Miecz", "Lem", "lem@wp.pl", "mezczyzna", 54));
        System.out.println(i);
        j.add(new Ksiazka("Chrzest", "Wis", "wis@wp.pl", "mezczyzna", 21));
        System.out.println(j);
        LinkedList n = new LinkedList();
        n.add("Powrot");
        n.add("Wstep");
        n.add("Miecz");
        n.add("Chrzest");
        System.out.println(n);
        redukuj(n, 2);
        System.out.println(n);
    }
    public static void redukuj(LinkedList<String> books, int n) {
        books.remove(n-1);
    }
}
