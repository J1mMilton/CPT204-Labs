import lab1.Student;
import lab1.inPlaceReverse;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import lab1.StopWatch;
import java.util.Arrays;
import java.util.Scanner;
import lab1.Student;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        StopWatch watch = new StopWatch();
//        watch.start();
//        System.out.printf("Hello and welcome!");
//        System.out.println(5/2);
//        System.out.println("Please input the array size");
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        double[] array = new double[size];
//        for (int i = 0; i < size; i++) {
//            System.out.println("Please input the "+ (i+1) + "th number");
//            input = new Scanner(System.in);
//            array[i] = input.nextDouble();
//        }
//        inPlaceReverse.reverseInPlace(array);
//        System.out.println(Arrays.toString(array));
//        watch.stop();
//        System.out.println(watch.getElapsedTime());
        //System.out.println(System.currentTimeMillis());
        Student zzr = new Student("zr","z","zmail","2");
        Student zby = new Student("by","z","bmail", "3");
        System.out.println(zzr);
        System.out.println(zby);
        System.out.println(zzr.less(zby));
    }
}