package Porównywanko;

public class WebColor {

    int r, g, b;

    public WebColor(int r, int g, int b) {
        // Just store the arguments for now, don't worry about invalid values
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getRed() {
        return r;
    }

    public int getGreen() {
        return g;
    }

    public int getBlue() {
        return b;
    }

    public int getColor() {
        // Parens are important here, as + has a higher precedence than <<
        return (r << 16) + (g << 8) + b;
    }

    public String toString() {
        return String.format("#%06x", getColor());
    }
}