package lab2;

public class BigIntegers {
    public static void divisible() {
        double num = Math.pow(10, 49);
        int count = 0;
        while (true) {
            if (num%2 == 0 || num%3==0) {
                System.out.println((int)num);
                count++;
            }
            if (count == 10) {
                break;
            }
            num++;
        }
    }
}
