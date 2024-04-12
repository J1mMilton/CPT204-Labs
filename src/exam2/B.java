package exam2;

public class B extends A implements C {
    public void f(C c) { System.out.println("fb(C)"); }
    public void f(A a) { System.out.println("fb(A)"); }
    public void f(B b) { System.out.println("fb(B)"); }
}
