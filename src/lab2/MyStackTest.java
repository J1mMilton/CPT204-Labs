package lab2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyStackTest {
    @Test
    public void simpleTest() {
        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack.getSize());
        int size = stack.getSize(); // this shit will change over time

        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }

}
