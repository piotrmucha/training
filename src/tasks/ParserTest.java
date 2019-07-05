package tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;


class ParserTest {
    @Test
    public  void testSimpleUse () { // order is important and repetition are not allowed
        List<Integer> actual = Parser.parser("1,2,3");
        List <Integer> expected = Arrays.asList(1,2,3);
        assertEquals(actual, expected);
    }


    @Test
    void testWithRepeat() { // order is not important, repetition are allowed and white space are allowed
        Set<Integer> actual = Parser.parserRepeat("2  , 2,1, 3, 4,4,5 ");
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2,3,4,5));
        assertEquals(actual,expected);
    }
}