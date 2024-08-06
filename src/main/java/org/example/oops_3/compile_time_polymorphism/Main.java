package org.example.oops_3.compile_time_polymorphism;

public class Main {

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("Hello");
    }
}
