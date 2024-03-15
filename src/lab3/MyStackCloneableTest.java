package lab3;

import lab2.MyStack;
import org.junit.jupiter.api.Test;

public class MyStackCloneableTest {

    @Test
    public void simpleTest() {
        MyStackCloneable stack = new MyStackCloneable();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack.getSize());
        int size = stack.getSize(); // this shit will change over time
        System.out.println(stack);
//        for (int i = 0; i < size; i++) {
//            System.out.println(stack.pop());
//        }

        System.out.println("-------------------------------------");

        MyStackCloneable stack2 = (MyStackCloneable) stack.clone();
        stack2.push("f");

        System.out.println(stack);
        System.out.println(stack2);

        System.out.println("---------------------------------------");

        MyLecStack stack3 = new MyLecStack(); //still returns object
        stack3.push("1");
        stack3.push("2");
        stack3.push("3");
        stack3.push("4");
        stack3.push("5");
        System.out.println(stack3);

        System.out.println("========================================");
        MyLecStack stack4 = (MyLecStack) stack3.clone();
        stack4.push("6");
        System.out.println(stack3);
        System.out.println(stack4);
    }
}
