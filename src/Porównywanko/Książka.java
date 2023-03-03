package Porównywanko;

import java.util.Comparator;
import java.util.Objects;

public class Książka implements Comparator<String>, Comparable<Książka> {

    private String nazwa;
    private String autor;

    public Książka(String nazwa, String autor) {
        this.nazwa = nazwa;
        this.autor = autor;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Książka książka = (Książka) o;
        return nazwa.equals(książka.nazwa) && autor.equals(książka.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, autor);
    }

    @Override
    public String toString() {
        return "Książka{" +
                "nazwa='" + nazwa + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }


    @Override
    public int compareTo(Książka o) {
        return 0;
    }

    @Override
    public int compare(String o1, String o2) {
        return 1;
    }
}
