package lab4;

import java.io.ObjectStreamException;
import java.util.ArrayList;

public class WildCard {

//    public static void main(String[] args) {
//        ArrayList<Integer> c = new ArrayList<>();
//        c.add(3);
//        c.add(4);
//        c.add(12);
//        print(c);
//    }

    public static void print(ArrayList<?> o) {
        for (Object e: o) {
            System.out.println(e);
        }
    }
}
