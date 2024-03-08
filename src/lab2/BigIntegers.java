package lab2;

import java.math.BigInteger;

public class BigIntegers {
//    public static void divisible() {
//        double num = Math.pow(10, 49);
//        int count = 0;
//        while (true) {
//            if (num%2 == 0 || num%3==0) {
//                System.out.println((int)num);
//                count++;
//            }
//            if (count == 10) {
//                break;
//            }
//            num++;
//        }
//    }

    public static void printNumber() {
        BigInteger huge = new BigInteger("10000000000000000000000000000000000000000000000000");
        int count = 0;
        while(true) {
            if (huge.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                huge.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(huge);

                count++;
            }
            if (count == 10) {
                break;
            }
            huge = huge.add(BigInteger.ONE);
        }
    }
}
