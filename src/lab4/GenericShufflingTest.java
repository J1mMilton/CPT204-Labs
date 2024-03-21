package lab4;

import lab3.ArrayListShuffling;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

public class GenericShufflingTest {
    @Test
    public void IntegerTest(){
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            GenericShuffling.shuffle(arr);
            System.out.println(arr);
    }

    @Test
    public void emptyList() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList());
        GenericShuffling.shuffle(arr);
        System.out.println(arr);
    }
}
