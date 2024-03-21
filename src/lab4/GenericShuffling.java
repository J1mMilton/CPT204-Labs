package lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericShuffling {
    public static <E> void shuffle(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = (int)(Math.random()*list.size());
//            E tmp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, tmp);
            Collections.swap(list, i, j);
        }
    }
}
