package lab5;

import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void methodGet(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static void foreach(List<?> list) {
        for (Object e: list) {
            e = e;
        }
    }

    public static void iterator(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next();
        }
    }
}
