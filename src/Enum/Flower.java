package Enum;

import java.util.Objects;

public class Flower {

    Colour kolorek;
    Length dlugosc;
    int n;
    String s;

    public Flower(Colour kolorek, Length dlugosc) {
        this.kolorek = kolorek;
        this.dlugosc = dlugosc;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "kolorek=" + kolorek +
                ", dlugosc=" + dlugosc +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return n == flower.n && kolorek == flower.kolorek && dlugosc == flower.dlugosc && Objects.equals(s, flower.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kolorek, dlugosc, n, s);
    }
}
