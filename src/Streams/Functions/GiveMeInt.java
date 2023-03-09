package Streams.Functions;

import java.util.function.IntSupplier;

public class GiveMeInt implements IntSupplier {

    @Override
    public int getAsInt() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }


}
