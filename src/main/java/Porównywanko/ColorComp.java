package Porównywanko;

import java.util.Comparator;

public class ColorComp implements Comparator<WebColor> {
    public int compare(WebColor c1, WebColor c2) {
        return c1.getColor() - c2.getColor();
    }
}
