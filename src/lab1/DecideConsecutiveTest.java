package lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class DecideConsecutiveTest {

    @Test
    public void testCase1() {
        int[] array = new int[]{1,2,2,3,3,3,3};
        //Assertions.assertTrue(Arrays.equals(expected, array));
        Assertions.assertTrue(DecideConsecutive.isConsecutiveFour(array));
    }

    @Test
    public void testEmptyArray() {
        int[] array = new int[]{};
        //Assertions.assertTrue(Arrays.equals(expected, array));
        Assertions.assertFalse(DecideConsecutive.isConsecutiveFour(array));
    }
}
