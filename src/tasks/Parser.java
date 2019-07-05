package tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parser {
    public static List<Integer> parser (String toParse) {
        List<Integer> result = new ArrayList<>();
        String[] integers = toParse.split(",");
        for (String integer : integers) {
            result.add(Integer.parseInt(integer));
        }
        return result;
    }
    public static Set<Integer> parserRepeat(String toParse) {
        Set<Integer> result = new HashSet<>();
        String[] integers = toParse.split(",");
        for (String integer : integers) {
            integer = integer.trim();
            result.add(Integer.parseInt(integer));
        }
        return result;
    }
}
