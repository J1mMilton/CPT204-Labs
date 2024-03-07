package lab2;

import org.junit.jupiter.api.Test;

public class MyPointTest {
    @Test
    public void testCase1() {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10.25, 20.8);
        MyPoint p3 = new MyPoint(13.25, 24.8);
        System.out.println(p1.distance(p2));
        System.out.println(MyPoint.distance(p1, p2));
    }
}
