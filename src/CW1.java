import exam2.A;
import exam2.B;
import exam2.C;

public class CW1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = (A)b;
        C cb = (C)b;
        a.f(a);
    }
}