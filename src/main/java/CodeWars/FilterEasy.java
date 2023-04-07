package CodeWars;

import java.util.List;
import java.util.stream.Collectors;


public class FilterEasy {


    public static List<Object> filterList(final List<Object> list) {

        return list.stream().filter(a -> a instanceof Integer).collect(Collectors.toList());

    }


}
