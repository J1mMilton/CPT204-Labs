package lab7;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mostOccur {
    public static void print(List<Integer> list) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for (Integer num: list) {
            if (m1.containsKey(num)) {
                m1.put(num, m1.get(num) + 1);
            }
            else {
                m1.put(num, 1);
            }
        }
        int max = 0;
        for (Integer val: m1.values()) {
            if (val > max) {
                max = val;
            }
        }
        for (Integer key: m1.keySet()) {
            if (m1.get(key) == max) {
                System.out.println(key);
            }
        }
    }

}
