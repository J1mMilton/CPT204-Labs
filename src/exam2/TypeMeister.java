package exam2;

public class TypeMeister {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        A ab = (A)b;
        C cb = (C)b;
        a.f(b);
    }
}
