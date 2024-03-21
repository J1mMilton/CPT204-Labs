package lab4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnLargestTest {
    @Test
    public void IntegerTest(){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(ReturnLargest.max(arr));
    }

    @Test
    public void emptyList() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList());
        System.out.println(ReturnLargest.max(arr));
    }
}
