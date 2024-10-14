package org.example.conc_3.synchronized_block;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();


        t1.join(); // MT will wait for T1 to complete
        t2.join(); // MT will wait for T2 to complete

        System.out.println("Final value:" + count.num);

    }
}
