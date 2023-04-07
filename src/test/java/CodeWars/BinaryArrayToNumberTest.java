package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;


public class BinaryArrayToNumberTest {
    @org.junit.Test
    public void convertBinaryArrayToInt() throws Exception {

        assertEquals(1, BinToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        assertEquals(15, BinToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        assertEquals(6, BinToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        assertEquals(9, BinToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
        assertEquals(512, BinToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,0,0,0, 0, 0, 0,0,0))));


    }
}