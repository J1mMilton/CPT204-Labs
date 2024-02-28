package lab1;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class inPlaceReverseTest {
    @Test
    public void testCase1() {
        double[] array = new double[]{1,2,3,4,5};
        double[] expected = new double[]{5,4,3,2,1};
        inPlaceReverse.reverseInPlace(array);
        //Assertions.assertTrue(Arrays.equals(expected, array));
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(array));
    }
}
