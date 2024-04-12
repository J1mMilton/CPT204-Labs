import java.util.Arrays;
import java.util.List;

public class some {
    public static int maxOfProper(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % (i + 1) == 0) {
                max = Math.max(max, list.get(i));
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 6);
        System.out.println(maxOfProper(list1));
        List<Integer> list2 = Arrays.asList(10, 25);
        System.out.println(maxOfProper(list2));
    }
}
