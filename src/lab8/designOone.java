package lab8;

public class designOone {
    public static void sumBetween(int n1, int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void sumBetweenOhOfOne(int n1, int n2) {
        int sum = (n1 + n2)*(n2-n1+1)/2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumBetween(1, 5);
        sumBetweenOhOfOne(1, 5);
    }
}
