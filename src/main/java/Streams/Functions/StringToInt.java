package Streams.Functions;

import java.util.function.ToIntFunction;

public class StringToInt implements ToIntFunction<String> {
    public int applyAsInt(String s) {
        return Integer.parseInt(s);
    }
}
