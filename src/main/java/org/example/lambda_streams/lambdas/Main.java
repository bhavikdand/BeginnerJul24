package org.example.lambda_streams.lambdas;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Runnable r = () -> {
                System.out.println("I am in a new thread");
                System.out.println("Save me");
        };

        Runnable r1 = () -> System.out.println("I am in a new thread");

        Callable<Integer> ci = () -> {
            System.out.println("In a callable");
            return 5;
        };

        Callable<Integer> ci1 = () -> 5;

        A a = n -> System.out.println("N:" + ++n);
        a.call(6);


        B b = (abc, xyz) -> {
            System.out.println(abc);
            System.out.println(xyz);
        };
    }
}

interface A{
    void call(int n);
}

interface B{
    void dontCall(int n, int m);
}

