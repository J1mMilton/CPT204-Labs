package lab1;

public class DecideConsecutive {
    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                }
                else {
                    i = j -1; //i will increment by 1 again above
                    break;
                }
            }
        }
        return false;
    }
}
