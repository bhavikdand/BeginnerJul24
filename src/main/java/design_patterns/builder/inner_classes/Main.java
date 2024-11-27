package design_patterns.builder.inner_classes;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
    }
}
