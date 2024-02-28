package lab1;

public class inPlaceReverse {
    public static void reverseInPlace(double[] arr) {
        int size = arr.length;
        for (int i = 0; i < (size-1)/2; i++) { //Fuck
            double tmp = arr[i];
            arr[i] = arr[size-1-i]; //Fuck size-1
            arr[size-1-i] = tmp;
        }
    }
}
