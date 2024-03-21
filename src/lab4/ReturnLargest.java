package lab4;

import java.util.ArrayList;

public class ReturnLargest {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list.size() == 0) {
            return null;
        }
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) == 1) {
                max = list.get(i);
            }
        }
        return max;
    }
}
