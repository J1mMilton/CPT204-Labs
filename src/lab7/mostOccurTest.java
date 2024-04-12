package lab7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class mostOccurTest {
    @Test
    public void testCase1() {
        List<Integer> list = Arrays.asList(2, 3, 40, 3, 5, 4, 3, 3, 3, 2, 0);
        mostOccur.print(list);
    }

    @Test
    public void testCase2() {
        List<Integer> list = Arrays.asList(9, 30, 3, 9, 3, 2, 4);
        mostOccur.print(list);
    }

    @Test
    public void emptyListTest() {
        List<Integer> list = Arrays.asList();
        mostOccur.print(list);
    }

}

