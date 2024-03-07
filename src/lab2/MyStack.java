package lab2;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek() {
        return super.getLast();
    }

    public Object pop() {
        return super.removeLast();
    }

    public void push(Object o) {
        super.add(o);
    }

    public int search(Object o) {
        return super.lastIndexOf(o);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}
