package lab3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListShufflingTest {

    @Test
    public void shuffling() {
        ArrayList<Number> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListShuffling.shuffle(arr);
        System.out.println(arr);
    }

    @Test
    public void emptyList() {
        ArrayList<Number> arr = new ArrayList<>(Arrays.asList());
        ArrayListShuffling.shuffle(arr);
        System.out.println(arr);
    }
}
