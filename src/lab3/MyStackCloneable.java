package lab3;

import java.util.ArrayList;

public class MyStackCloneable extends ArrayList<Object>  { //ArrayList implements Cloneable already
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
        int index = super.lastIndexOf(o);
        if (index == -1) {
            return index;
        }
        return getSize() - 1 - index;
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
