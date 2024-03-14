package lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListShuffling {
    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int j = (int)(Math.random()*list.size());
//            Number tmp = list.get(i);
//            list.set(i, list.get(j));
//            list.set(j, tmp);
            Collections.swap(list, i, j);
        }
    }
}
