package Porównywanko;

import java.util.Comparator;
import java.util.Objects;

public class Książka implements Comparable<Książka> {

    private String nazwa;
    private String autor;
    private final int ID;

    public Książka(String nazwa, String autor, int ID) {
        this.ID = ID;
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
                ", ID='" + ID + '\'' +
                '}';
    }


    @Override
    public int compareTo(Książka o) {
        int result;

        result = this.autor.compareTo(o.autor);
        if (result != 0) {
            return result;
        } else {
            result = this.nazwa.compareTo(o.nazwa);
        }
        System.out.println(result);
        return result;
    }

    static class KomparatorID implements Comparator<Książka> {

        @Override
        public int compare(Książka o1, Książka o2) {
            int ID = o1.ID - o2.ID;
            return ID == 0 ? o1.compareTo(o2) : ID;
        }
    }

}
