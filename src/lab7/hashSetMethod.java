package lab7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class hashSetMethod {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();
        set.add("Red");
        set.add("Yellow");
        set.add("Green");
        set.add("Blue");
        System.out.println(set.headSet("Purple").first()); //blue
        System.out.println(set.tailSet("Purple").first()); //red

//        HashSet<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(5);
//
//        HashSet<Integer> set2 = new HashSet<>();
//        set2.add(2);
//        set2.add(3);
//        set2.add(6);
//        set1.retainAll(set2);
//        System.out.println(set1);
    }
}
