package CodeWars;

import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class HighAndLowFromString {

    public static String highAndLow(String numbers) {

        Optional<Integer> max;
        Optional<Integer> min;

        max =  Arrays.stream(numbers.split(" ")).map(a->Integer.parseInt(a)).peek((a)-> System.out.println(a)).max(Comparator.naturalOrder());
        min =  Arrays.stream(numbers.split(" ")).map(Integer::parseInt).min(Comparator.naturalOrder());


        String wynik = max.orElse(0) +" "+min.orElse(0);
        return wynik;
    }

}

