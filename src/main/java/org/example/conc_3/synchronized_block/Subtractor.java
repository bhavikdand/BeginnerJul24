package org.example.conc_3.synchronized_block;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i <10000; i++){
            synchronized (count) {
                count.num--;
            }
        }
        System.out.println("Ending subtractor");
    }
}
