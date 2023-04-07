package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class BinToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int result = 0;
        for (int i = 1; i <= binary.size(); i++) {

            result = (int) (result + binary.get(binary.size() - i) * Math.pow(2, (i - 1)));

        }

        // MUCH BETTER SOLUTION
        //  binary.stream().reduce((a,b)->a*2+b).get();

        return result;
    }


}


