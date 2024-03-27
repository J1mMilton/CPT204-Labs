package lab5;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class ListIteratorTest {
    @Test
    public void test() {
        //initialize Linkedlist
        double t1, t2;
        LinkedList<Integer> list = new LinkedList();
        t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(1);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Assign values took " + (t2 - t1) + " milliseconds");

        //test get
        t1 = System.currentTimeMillis();
        ListIterator.methodGet(list);
        t2 = System.currentTimeMillis();
        System.out.println("Get used " + (t2 - t1) + " milliseconds");

        //test iterator
        t1 = System.currentTimeMillis();
        ListIterator.iterator(list);
        t2 = System.currentTimeMillis();
        System.out.println("Iterator used " + (t2 - t1) + " milliseconds");
    }
}
