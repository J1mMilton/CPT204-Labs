package lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueTest {

    Queue<String> q1 = new LinkedList<>();
    Queue<String> q2 = new LinkedList<>();

    @BeforeEach
    public void setQueues() {

        q1.offer("George");
        q1.offer("Jim");
        q1.offer("John");
        q1.offer("Blake");
        q1.offer("Kevin");
        q1.offer("Michael");

        q2.offer("George");
        q2.offer("Katie");
        q2.offer("Kevin");
        q2.offer("Michelle");
        q2.offer("Ryan");
    }
    @Test
    public void union() {
        q1.addAll(q2);
        System.out.println("Union: " +q1);
    }

    @Test
    public void difference() {
        q1.removeAll(q2);
        System.out.println("Difference: " +q1);
    }

    @Test
    public void intersection() {
        q1.retainAll(q2);
        System.out.println("Intersection: " +q1);
    }

}
