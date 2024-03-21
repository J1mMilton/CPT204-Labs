package lab4;


public class Pair<E, T> {
    public E first;
    public T second;

    public Pair(E first, T second) {
        this.first = first;
        this.second = second;
    }

    public static void print(Pair p) {
        System.out.println(p.first + " " + p.second);
    }

    public static void main(String[] args) {

    }
}

