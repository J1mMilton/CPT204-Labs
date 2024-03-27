package lab5;

import java.util.List;

public class ListIterator {
    public static void methodGet(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }

    public static void iterator(List<?> list) {
        for (Object e: list) {
            e = e;
        }
    }
}
