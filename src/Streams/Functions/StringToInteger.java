package Streams.Functions;

import java.util.function.Function;

public class StringToInteger implements Function<String, Integer> {
    public Integer apply(String s) {
        return Integer.valueOf(s);
    }
}