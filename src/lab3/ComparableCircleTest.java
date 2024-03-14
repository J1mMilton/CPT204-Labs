package lab3;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableCircleTest {
    @Test
    public void compareCircleSize(){
        ComparableCircle c1 = new ComparableCircle(2);
        ComparableCircle c2 = new ComparableCircle(3);
        List<ComparableCircle> list = Arrays.asList(c1, c2);
        System.out.println(Collections.max(list));
    }
}
