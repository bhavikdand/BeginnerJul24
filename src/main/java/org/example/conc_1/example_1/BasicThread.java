package org.example.conc_1.example_1;

public class BasicThread implements Runnable{

    @Override
    public void run() {
        System.out.println("I am in a new thread, " +
                "name of the thread is "
                + Thread.currentThread().getName());
    }
}
