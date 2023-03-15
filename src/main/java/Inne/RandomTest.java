package Inne;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class RandomTest {


    public int castowanie(int a, int b) {
        return a * b;
    }

    public int sumaWithArgs(int arg0, int... args) {

        int wynik = arg0;
        for (int i : args) {
            wynik += args[i];
        }
        System.out.println(wynik);
        return wynik;

    }


    public void stringConcat() {
        StringJoiner joiner = new StringJoiner(",", "{", "}");
        String result = joiner.add("Ania").add("ma").add("kota").toString();
        System.out.println(result);
    }

    public void stringConcat2() {
        List<String> names = Arrays.asList("Ania", "Karol", "Bartek", "Jerzy");
        String allNames = names.stream().collect(Collectors.joining(", ", "{", "}"));
        System.out.println(allNames);

    }

}
