package org.example.oops_3.demo_2;

public class Scenario1 {

    public static void main(String[] args) {
        C c = new C();
    }
}

class A{
    public A() {
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        System.out.println("B");
    }
}

class C extends B{
    public C(){
        System.out.println("C");
    }
}
