package lab4;

import org.junit.jupiter.api.Test;

public class PairTest {
    @Test
    public void testCase1() {
        Pair<Integer, Double> p1 = new Pair<>(1, 85.5);
        Pair<Integer, String> p2 = new Pair<>(2, "good");
        Pair.print(p1);
        Pair.print(p2);
    }
}
