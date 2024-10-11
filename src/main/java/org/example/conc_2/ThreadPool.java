package org.example.conc_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

//        Thread thread = new Thread(np);
//        thread.start();
        ExecutorService es = Executors.newFixedThreadPool(2); // Create the thread pool
        for(int i=0; i<5; i++) {
            es.execute(np);
        }
        es.shutdown();
    }
}
