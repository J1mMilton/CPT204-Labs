package lab3;

public class MyLecStack implements Cloneable{
    private java.util.ArrayList list = new java.util.ArrayList();
    public void push(Object o) {
        list.add(o);
    }
    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }
    public Object peek() {
        return list.get(getSize() - 1);
    }
    public int search(Object o) {
        return list.lastIndexOf(o);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int getSize() {
        return list.size();
    }
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("shit");
            return null;
        }
    }
}

