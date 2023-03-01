package Enum;

public class Flower {

    Colour kolorek;
    Length dlugosc;

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


}
