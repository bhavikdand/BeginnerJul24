package org.example.conc_1.example_1;

public class Main {
    public static void main(String[] args) {
        BasicThread basicThread = new BasicThread();
        Thread thread = new Thread(basicThread);
        thread.start();
        System.out.println("I am in main thread, proof is this " +
                Thread.currentThread().getName());
    }
}
